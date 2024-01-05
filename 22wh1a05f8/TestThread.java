package cse_c_225f8;

public class TestThread extends Thread {
		public void run()
		{
		try
		{
			System.out.println("this is thread 1");
		}
		catch(Exception e)
		{
			System.out.println("this is thread 2");
		}
		}
	public static void main (String[]args) throws InterruptedException
	{	
		int n=3;
		int i;
		for (i=0;i<3;i++)
		{
			TestThread t1=new TestThread();
			t1.start();
		}
	}
}
