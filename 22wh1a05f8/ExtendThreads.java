package cse_c_225f8;

public class ExtendThreads extends Thread
{
	public static void main(String [] args)
	{
		Thread t = new Thread();
		t.start();
		System.out.println("This is running inside");	
	}
	public void run()
	{
		System.out.println("This is running outside");
	}
}
