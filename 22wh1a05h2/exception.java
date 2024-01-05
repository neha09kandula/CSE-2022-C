package frames;

public class exception extends Thread{

	public static void main(String[] args) {
		exception t1 = new exception();
		t1.start();
		exception t2 = new exception();
		t2.start();
		exception t3 = new exception();
		t3.start();
		try {
			t1.sleep(3000);
			System.out.println("it is sleeping zzz....");
			t2.isAlive();
			System.out.println("i am alive hurayyy");
			t3.yield();
			System.out.println("i am paused");
			t1.sleep(50);
			System.out.println("i am sleeping");
			
		}
		catch(InterruptedException e)
		{
			System.out.println("error has occured");
		}
	
		
	

	}
	public void run() {
		System.out.println("running rest of code");
	}

}
