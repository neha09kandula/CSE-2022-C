package cse225f7;

public class implementthreads implements Runnable {
	public static void main(String args[]) {
	implementthreads t1 = new implementthreads();
		 implementthreads obj = new implementthreads();
		 Thread thread = new Thread(obj);
		 thread.start();
		 System.out.println("This code is outside of the thread");
		 }
		 public void run() {
		 System.out.println("This code is running in a thread");
		  }
	
	}

