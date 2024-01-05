package cse225e3;

public class Multithreads extends Thread {

    public static void main(String[] args) {
        Multithreads thread1 = new Multithreads();
        thread1.start();

        Multithreads thread2 = new Multithreads();
        thread2.start();

        try {
            Thread.sleep(2000);
            thread1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2000; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted and an exception is thrown");
        }
    }
}
