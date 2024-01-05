package javaprogram;

public class multiplethreads implements Runnable {
	public void run() {
		try {
			Thread.sleep(1450);
		}
		catch(InterruptedException e) {
			System.out.println("MyThread is Interrupted");
		}
	}
}

class Main{
	
	public static void main(String[] args) {
		multiplethreads myThread = new multiplethreads();
		Thread thread = new Thread(myThread);
		thread.start();
		thread.interrupt();

	}

}
