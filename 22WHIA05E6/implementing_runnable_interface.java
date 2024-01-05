package learning_java;

public class implementing_runnable_interface implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implementing_runnable_interface t=new implementing_runnable_interface();
		Thread t1=new Thread(t);
		 t1.start();

	}

}




  