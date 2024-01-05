package Java;
import java.util.*;

public class main implements thread
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread t = new Thread();
       t.start();
       System.out.println("Thread is Running inside");
	}
	 public void run()
	 {
		System.out.println("Thread is Running outside");
	 }

}
