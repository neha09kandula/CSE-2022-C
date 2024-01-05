package Java;
import java.io.*;
import java.util.*;
public class RunThread implements Runnable {

	public static void main(String[] args) {
		RunThread obj1=new RunThread();
		Thread t1=new Thread(obj1);
		t1.start();
	}
	
	public void run() {
		System.out.println("This is running outside the main function!");
	}
}
