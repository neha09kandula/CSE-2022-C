package Java;
import java.util.*;
public class A implements Runnable{

	public static void main(String[] args) {
		A ex = new A();
		Thread t1 = new Thread();
		t1.start();
		System.out.println("Thread is Starated");
	}
	public void run() {
		System.out.println("Thread is Ended");
	}

}
