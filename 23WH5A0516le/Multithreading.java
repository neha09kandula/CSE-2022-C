package java07;

public class Multithreading {

	public static void main(String[] args) {
		try {
			for (int i = 7; i > 0; i--) {
			System.out.println("Main Thread: " + i);
			Thread.sleep(120);
			}
			} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
			}
			System.out.println("Main thread exiting.");
	}

}
