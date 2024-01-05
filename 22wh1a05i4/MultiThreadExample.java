package wh225i6;

public class MultiThreadExample extends Thread 
{
	public static void main(String args[]) 
	{
		MultiThreadExample thread1 = new MultiThreadExample();
		MultiThreadExample thread2 = new MultiThreadExample();

	    // Start both threads
	    thread1.start();
	    thread2.start();
	    MultiThreadExample obj = new MultiThreadExample();
	    obj.run();
	    
	}
}
class MyTh 
{
	public void run() 
	{
	    for (int i = 1; i <= 5; i++) 
	    {
	        System.out.println(Thread.currentThread().getId() + " Value " + i);
	        try 
	        {
	            Thread.sleep(100);
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}	
}