package Thread;

import java.util.Random;

import Buffer.Buffer;

public class CarrinhoThread implements Runnable {

	//private static Random generator = new Random();
	private Buffer sharedLocation; 


	public CarrinhoThread( Buffer shared )
	{
		sharedLocation = shared;
	}
	@Override
	public void run() {

	}

}
