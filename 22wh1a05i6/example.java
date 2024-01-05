package wh225i6;

public class example extends Thread
{
	public static void main(String args[])
	{
		example Thread = new example();
		Thread.start();
		System.out.println("Thread is runnig inside");
		
	}
	public void run()
	{
		System.out.println("Thread is running outside");
	}

}
