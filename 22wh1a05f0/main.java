package cse225f0;

public class main extends Thread
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		t.start();
		System.out.println("Thread is running inside");
	}
public void run()
{
	System.out.println("Thread is running outside");
}
}
