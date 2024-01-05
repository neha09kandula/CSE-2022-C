package cse225e4;
public class Exthreads extends Thread {
	public static void main(String [] args) {
		Exthreads Thread=new Exthreads(); 
		Thread.start(); //we're using this to start a new thread
		System.out.println("Thread is running");
	}
	public void run() {
		System.out.println("This thread is now running outside of the main!"); //the print statement inside main function will always run first!

	}

}