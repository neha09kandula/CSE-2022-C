package Java;
import java.io.*;
public class MultiThread implements Runnable{
	public static void main(String [] args) {
		System.out.println("This is in the main!");
		Thread t1=new Thread("Amanya");
		Thread t2=new Thread("Swathi");
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
	public void run() {
		new MultiThread();
		
	}
}
