package cse225e4;
import java.io.*;
public class MultiThread extends Thread {
    public static void main(String[] args) {
        MultiThread thread1 = new MultiThread();
        thread1.start();
        MultiThread thread2 = new MultiThread();
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