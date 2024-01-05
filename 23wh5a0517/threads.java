
public class threads {

	public static void main(String[] args) {
	thread t=new thread();
	t.start();
	System.out.println("thread is running inside");
	}
	public void run()
	{
		System.out.println("thread is running outside");

	}

}
