package Java;

public class Multithreading extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading t1 = new Multithreading();
		Thread t2 = new Thread();
		t1.start();
		System.out.println("Thread t1 is running inside");
		t2.start();
		System.out.println("Threading t2 is running outside");
       }
	  public void run() {
		  System.out.println("Threading is running inside");
	  }
}
