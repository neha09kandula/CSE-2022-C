package frames;

public class threads extends Thread{

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println("thread is running inside!");

	}
	public void run() {
		System.out.println("thread is running outside!!!");
	}

}
