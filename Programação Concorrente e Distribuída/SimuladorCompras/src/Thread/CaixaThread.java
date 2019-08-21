package Thread;

import Buffer.Buffer;

public class CaixaThread implements Runnable{

	private Buffer sharedLocation; 

	   
	   public CaixaThread( Buffer shared )
	   {
	      sharedLocation = shared;
	   }


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
