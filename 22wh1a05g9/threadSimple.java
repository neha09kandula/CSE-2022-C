package labprograms;

public class Main extends thread{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread t1= new thread();
		thread t2= new thread();
		t1.start();
		t2.start();
		System.out.println("Thread is running");
	}
	public void run()
	{
		
		System.out.println("Thread is running outside");
	}
	
}
