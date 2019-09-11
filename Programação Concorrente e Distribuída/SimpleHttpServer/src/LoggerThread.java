import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LoggerThread extends Thread {
	
	private static LoggerThread instance = new LoggerThread();
	private BlockingQueue<String> itemsToLog = new ArrayBlockingQueue<String>(100);
	private static final String SHUTDOWN_REQ = "SHUTDOWN";
	private volatile boolean shuttingDown, loggerTerminated;

	public void run() {
		try {
			String item;
			while ((item = itemsToLog.take()) != SHUTDOWN_REQ) {
				System.out.println(item);
			}
		} catch (InterruptedException iex) {
		} finally {
			loggerTerminated = true;
		}
	}
	public static LoggerThread getLogger() {
		if(instance == null){
			instance = new LoggerThread();			
		}
		return instance;
	}
	private LoggerThread() {
		start();
	}
	public void putMessage(String str) {
	    if (shuttingDown || loggerTerminated) return;
	    try {
	      itemsToLog.put(str);
	    } catch (InterruptedException iex) {
	      Thread.currentThread().interrupt();
	      throw new RuntimeException("Unexpected interruption");
	    }
	  }
	public void shutDown() throws InterruptedException {
		  shuttingDown = true;
		  itemsToLog.put(SHUTDOWN_REQ);
		}
}
