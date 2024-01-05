package cse225h8;

public class threadsExtending extends Thread
{
	public static void main(String [] args)
	{
		Thread t = new Thread();
		t.start();
		System.out.println("the threa is running.");
		threadsExtending obj = new threadsExtending();
		obj.run();
	}
	public void run()
	{
		System.out.println("The thread is running outiside.");
	}
}
