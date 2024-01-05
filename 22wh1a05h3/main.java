package cse5c4;
import java.util.*;

public class main extends Thread {

	public static void main(String[]args) {
		main t1=new main();
		 main t2=new main();
		try
		{
			t1.start();
			t1.sleep(1500);
			System.out.println("Thread 1 is sleeping");
			
			t2.start();
			t2.join();
			t1.interrupt();
		}
		catch(InterruptedException  e)
		{
			System.out.println("thread got interrupted");
		}
	}
		public void run()
		{
			 try {
		            if (Thread.currentThread().getId() == 1) {
		                sleep(1000);
		                System.out.println("Thread 1 is running");
		            }
		            else {
		                
		                sleep(500);
		                System.out.println("Thread 2 is running");
		            }
		        } 
			 catch (InterruptedException e) {
		            System.out.println("Thread " + Thread.currentThread().getId() + " got interrupted");
		        }
		}
	}

