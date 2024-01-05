package cse225e3;

public class Threads implements Runnable {
    
    public Threads() {
        Thread t = new Thread(this); // Pass the current instance of Threads as the Runnable
        t.start();
        System.out.println("Thread is running inside");
    }

    @Override
    public void run() {
        // Code to be executed when the thread is started
        System.out.println("Thread is running outside");
    }

    public static void main(String[] args) {
        new Threads(); // Create an instance of Threads, which will start a new thread
    }
}
