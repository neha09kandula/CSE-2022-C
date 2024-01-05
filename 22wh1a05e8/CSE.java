package Java;

public class CSE extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CSE thread = new CSE();
    thread.start();
    System.out.println("Thread is Running inside");
	}
	public void run() {
    System.out.println("Thread is Running outside");
	}
}