package cse225g1;

public class thread extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread t = new thread();
		t.start();
		System.out.println("Thread running inside..");
	}
	public void run() {
		System.out.println("Thread running outside..");
	}

}
