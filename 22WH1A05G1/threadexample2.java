package cse225g1;

public class thread2 extends Thread {
	public void run() {
		System.out.println("Running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 =new thread2();
		Thread t2 = new thread2();
		Thread t3 = new thread2();
		t1.start();
		try {
			t1.sleep(1500);
			t1.isAlive();		}
		catch(InterruptedException e) {
			System.out.println("Do not Disturb");
		}

	}

}
