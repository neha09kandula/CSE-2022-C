package cse225d8;

public class CSE extends Thread {

	public static void main(String[] args) {
		    CSE thread =new CSE();
		    thread.start();
		    System.out.println("thread is running inside");
	}
	public void run()
	{
		System.out.println("thread is running outside");
	}
}
