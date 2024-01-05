package Java;
import java.io.*;
import java.util.*;
class TCMthread extends Thread{
	public void run() {
		try {
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		}
		catch(Exception e){
			System.out.println("There's an exception :?");
		}
	}
}
public class MultiThreading{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0;i<n;i++) {
		TCMthread obj1=new TCMthread();
		obj1.start();
	}
}
}

