package programs;

public class threadsinterface implements Runnable{
	threadsinterface()
	{
		Thread t=new Thread();
		t.start();
		System.out.println("Thread is started");
	}
	public static void main(String[] args)
	{
		threadsinterface o=new threadsinterface();
		o.run();
		
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread is running");
	}
	}
