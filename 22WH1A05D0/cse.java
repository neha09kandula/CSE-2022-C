package Cse5d0;

public class cse extends Thread {
	public static void main(String [] args)
	{
		cse thread =new cse();
		thread.start();
		System.out.println("Thread is running");
		}
	public void run()
	{
		System.out.println("Thread is running outside");		
	}
}
