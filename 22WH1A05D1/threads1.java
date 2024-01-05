package cse225d1;
import java.util.*;

class MyThread1 implements Runnable { 
    public void run(){ 
        for (int i = 0; i < 5; i++) { 
            System.out.println("suspend");      
            try { 
                Thread.sleep(1000); 
            }

            catch (InterruptedException e) {
            	System.out.println("You have interrupted the thread which has slept");
            } 
            try {
            	Thread.sleep(690);
            }
            catch(InterruptedException e) {
            	System.out.println("You have interrupted the thread which has slept");
            }
        } 
    } 
} 
class MyThread2 implements Runnable {    
    public void run() 
    { 
        for (int i = 0; i < 5; i++) { 
            System.out.println("sleep"); 
            try { 
                Thread.sleep(1000); 
            }
            catch (InterruptedException e) { 
            	System.out.println("You have interrupted the thread which has slept");
            } 
        } 
    }
} 

public class threads1 {

	public static void main(String[] args) {
		Runnable obj1 = new MyThread1();  
        Runnable obj2 = new MyThread2(); 
        Thread t1 = new Thread(obj1); 
        Thread t2 = new Thread(obj2); 
        t1.start(); 
        t2.start(); 
	}

}
