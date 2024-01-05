package cse513;
import java.util.*;

public  class Multithreading implements Runnable {
	Multithreading(){
		Thread t1 =new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t1.start();
		t2.start();
		t3.start();
		
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("enter the number");
		  int number= input.nextInt();
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
