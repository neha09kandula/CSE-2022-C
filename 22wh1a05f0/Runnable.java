package cse225f0;
import java.util.*;
public class A implements Runnable
{
	public static void  main(String[] args)
	{
		
	 A ex = new A();
	 Thread t = new Thread();
	 t.start();
	 System.out.println("Thread has started");
}
public void run()
{
   System.out.println("Thread has ended");
}
}
