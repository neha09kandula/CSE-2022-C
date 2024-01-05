package Java;
import java.io.*;
import java.util.*;
public class Exthread extends Thread {
	public static void main(String [] args) {
		Exthread Thread=new Exthread(); 
		Thread.start(); //we're using this to start a new thread
		System.out.println("Thread is running :D");
	}
	public void run() {
		System.out.println("This thread is now running outside of the main!"); //the print statement inside main function will always run first!
	}
}
