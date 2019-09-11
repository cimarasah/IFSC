import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.io.FileWriter;

public class LoggerThread implements Runnable {
	
	private static String file;

	private LinkedBlockingQueue queue;
	private static final String SHUTDOWN_REQ = "SHUTDOWN";
	private volatile boolean shuttingDown, loggerTerminated;
	private BufferedWriter bw;
	private boolean Writing;

	public void run() {
		try {
			String item;
			while ((item = (String) queue.take()) != SHUTDOWN_REQ) {
				writeToLog(item);
			}
		} catch (InterruptedException iex) {
		} finally {
			loggerTerminated = true;
		}
	}
	
	
	public LoggerThread(String fileLogName, LinkedBlockingQueue queue){
	    
	    try {
	    	this.queue = queue;
	        new File(file).createNewFile();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }


	}
	private void writeToLog(String item){
	    try{
	        Writing = true;

	        bw = new BufferedWriter(new FileWriter(file, true));
	    while(!queue.isEmpty()){

	            bw.write(item);
	            bw.newLine();

	    }

	    bw.flush();
	    bw.close();
	    Writing = false;
	    }catch(Exception e){Writing = false; e.printStackTrace();}
	}
	public void putMessage(String str) {
	    if (shuttingDown || loggerTerminated) return;
	    try {
	    	queue.put(str);
	    } catch (InterruptedException iex) {
	      Thread.currentThread().interrupt();
	      throw new RuntimeException("Unexpected interruption");
	    }
	  }
	public void shutDown() throws InterruptedException {
		  shuttingDown = true;
		  queue.put(SHUTDOWN_REQ);
		}
}
