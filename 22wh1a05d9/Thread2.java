package Frame;
public class Thread2 extends Thread {
	public static void main(String[] args) {
    	Thread t = new Thread(); 
        t.start();
        System.out.println("Thread is running inside");
    }
    public void run() {
        System.out.println("Thread is running outside");
    }
}