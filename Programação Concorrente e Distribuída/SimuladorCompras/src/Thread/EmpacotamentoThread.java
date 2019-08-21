package Thread;

import Buffer.Buffer;

public class EmpacotamentoThread implements Runnable{
	
	private Buffer sharedLocation; 
	
	public EmpacotamentoThread( Buffer shared )
	   {
	      sharedLocation = shared;
	   }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
