package learning_java;

public class extending_thread_class extends Thread {
	public void run() {
		System.out.println("thread is running..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extending_thread_class thread=new extending_thread_class();
		thread.start();

	}


}
