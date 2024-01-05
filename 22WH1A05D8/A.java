package cse225d8;

public class A implements Runnable {
    Thread t;

    public A() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
 
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        new A();
    }
}
