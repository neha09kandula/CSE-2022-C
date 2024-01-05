package javaprogram;

public class cse extends Thread {
	public static void main(String args[]) {
		cse t=new cse();
		t.start();
		System.out.println("threads is running inside");
	}
	public void run() {
		System.out.println("threads is running outside");
	}

}
