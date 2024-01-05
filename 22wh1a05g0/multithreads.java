package cse_225g0;

import java.util.Scanner;

public class multithreads extends Thread {
	public static int num ;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		multithreads t1=new multithreads();
		multithreads t2=new multithreads();
		multithreads t3=new multithreads();
		t1.start();
		System.out.print("enter num:");
		num=sc.nextInt();
		t2.start();
		t3.start();
		System.out.println("Thread is running");

	}

}
