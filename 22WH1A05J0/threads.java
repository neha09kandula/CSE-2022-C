package priyanka;
import java.util.*;
public class threads implements Runnable{
	
		public void run()
		 {
			 
			 try
			 {
				 Thread.sleep(1500);
				 System.out.println("run");
				 Thread.sleep(1450);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println("exception");
			 }
	      }
	 
	public static void main(String args[])
	{
		
		threads myThread = new threads();
		Thread t1=new Thread(myThread);
		Thread t2=new Thread(myThread);
		t1.start();
		t2.start();
		
	}
}
