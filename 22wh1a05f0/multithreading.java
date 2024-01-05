package cse225f0;


	public class multithreading  extends Thread{

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
			multithreading myThread = new multithreading();
			Thread thread = new Thread(myThread);
			thread.start();
			thread.interrupt();

		}

	}
