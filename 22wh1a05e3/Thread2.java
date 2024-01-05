package cse225e3;
public class Thread2 extends Thread {
	public static void main(String[] args) {
    	Thread t = new Thread(); 
        t.start();
        System.out.println("Thread is running inside");
    }
    @Override
    public void run() {
        System.out.println("Thread is running outside");
    }
}
