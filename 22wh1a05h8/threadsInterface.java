package cse225h8;

public class threadsInterface implements Runnable {
	//Constructor.
	threadsInterface()
	{
		Thread t = new Thread();
		t.start();
		System.out.println("Thread is running inside.");
	}
	public static void main(String[] args) {
		threadsInterface obj = new threadsInterface();
		obj.run();
	}

	
	public void run() {
		System.out.println("Thread is running outside.");
		
	}

}
