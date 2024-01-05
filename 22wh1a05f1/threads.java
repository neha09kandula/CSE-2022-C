package cse225f1;

public class threads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Thread t = new Thread(); 
		t.start();
		System.out.println("Thread is running inside");
		
	}
	public void run()
	{
		System.out.println("Thread is running outside");
	}

}
