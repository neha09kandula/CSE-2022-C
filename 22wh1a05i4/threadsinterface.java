package wh225i6;

public class threadsinterface implements Runnable
{
	threadsinterface()
	{
		Thread t=new Thread();
		t.start();
		System.out.println("Thread has started running");
	}
	public static void main(String[] args)
	{
		threadsinterface o=new threadsinterface();
		o.run();
	}
	@Override
	public void run() 
	{
		System.out.println("Thread is stll running");
	}
}