package cse5i5;


public class Example extends Thread {
	public static void main(String args[])

	{

		Example Thread = new Example();

		Thread.start();

		System.out.println("Thread is runnig inside");

		

	}

	public void run()

	{

		System.out.println("Thread is running outside");

	}


}
