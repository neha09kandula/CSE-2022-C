package cse225f7;

public class  ExampleExtending extends Thread {
	public void run() {
    System.out.println("thread is running");
	}
	public static void main(String args[]) {
		ExampleExtending t1=new ExampleExtending ();  
		t1.start();  
		 }  
}

