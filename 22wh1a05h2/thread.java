package frames;

public class thread extends Thread {

    public static void main(String[] args) {
        thread t1 = new thread();
        thread t2 = new thread();

        t1.start();
        System.out.println("Thread 1 started");
        t2.start();
        System.out.println("Thread 2 started");
    }

    public void run() {
        Thread.yield();
        System.out.println("Thread executed");
    }
}