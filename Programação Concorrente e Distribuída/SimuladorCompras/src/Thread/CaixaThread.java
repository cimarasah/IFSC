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
		for ( int count = 1; count <= 10; count++ ) 
	      {
			
	      }
		
	}
}
