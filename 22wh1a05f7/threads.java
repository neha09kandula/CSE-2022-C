package cse225f7;

public class threads implements Runnable { 
		public void run(){  
		System.out.println("thread is running");  
		}  
		public static void main(String args[]){  
	    threads m1=new threads();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
		}  
