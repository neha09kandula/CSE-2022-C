package programs;

public class extendingthread extends Thread{
	public static void main(String[] args)
	{
		Thread t=new Thread();
		t.start();
		System.out.println("Thraed is running inside");
		extendingthread obj=new extendingthread();
		obj.run();
	}
	public void run()
	{
		System.out.println("Thread is running outside");
	}

}
