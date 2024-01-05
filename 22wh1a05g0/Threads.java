package cse_225g0;
import java.util.*;
public class Threads extends Thread {

	public static void main(String[] args) {
		Threads t1=new Threads();
		t1.start();
		System.out.println("Thread is running");

	}
	public void run(){
		System.out.println("thread is running outside");
	}

}
