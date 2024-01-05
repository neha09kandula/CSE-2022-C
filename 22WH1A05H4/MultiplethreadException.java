package javaprogrames;
public class Exception extends Thread{
public static void main(String[] args) {
	Exception t1=new Exception();
	Exception t2=new Exception();
	Exception t3=new Exception();
	t1.start();
	t2.start();
	t3.start();
	try {
	    t1.sleep(100);
	    System.out.println("The t1 is in sleep");
	    t2.isAlive();
	    System.out.println("The t2 is alive");
	    t1.sleep(50);
	    System.out.println("The t1 is disturbed");
	    t3.yield();
	    System.out.println("The t3 is paused");
	} catch (InterruptedException e) {
	    System.out.println(e);
	}
}
public void run(){
	System.out.println("The Code is running inside");
}
}
