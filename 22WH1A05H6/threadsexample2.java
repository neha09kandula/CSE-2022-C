package csec;

public class threadsexample2 extends Thread{
public static void main(String[] args)
{
	threadsexample2 thread=new threadsexample2();
	thread.start();
	System.out.println("Thread is running inside");
}
public void run() {
	System.out.println("Thread is running outside");
}
}
