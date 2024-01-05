package cse5i2;



public class  Threads extends Thread {
	
		public static void main(String args[])
		{
			Thread thread=new Thread();
			thread.start();
			System.out.println("Thread is running inside");
			
		
		}
		public void main()
		{
			System.out.println("Thread is running outside");
		}
		
		
	}
