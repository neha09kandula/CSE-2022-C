package java07;

public class mythread {

	public static void main(String[] args) {
	
		Thread t=new Thread();

		 t.start();

		 System.out.println("thread is running inside");	 

	 }

	 public void run() {

		 System.out.println("thread is running outside");

	}
}
