package cse225g7;

class csec implements Runnable {
	
	public void run()
	{
		System.out.println("Thread is created using Runnable interface");
	}

	public static void main(String[] args)
	{
		csec obj = new csec();
		Thread myThread = new Thread(obj);
		myThread.start();
	}
}

