package cse225f0;

public class CSE extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSE Thread = new CSE();
		Thread.start();
		System.out.println("Thread is running inside");
	}
public void run()
{
	System.out.println("Thread is running outside");
}

	}

