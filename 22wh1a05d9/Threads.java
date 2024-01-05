package Frame;

public class Threads implements Runnable {
    
    public Threads() {
        Thread t = new Thread(this); 
        t.start();
        System.out.println("Thread is running inside");
    }
    public void run() {
        System.out.println("Thread is running outside");
    }
    public static void main(String[] args) {
        new Threads(); 
    }
}