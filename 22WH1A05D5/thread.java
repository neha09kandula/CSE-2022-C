package frames;

public class thread extends Thread {
    public static void main(String[] args) {
        
        Thread t1 = new Thread();
        t1.start();
            System.out.println("Thread is running inside");
    }
    public void run() {
    	System.out.println("Thread is running outside");
    }
}    
