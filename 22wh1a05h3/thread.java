package cse5c4;
import java.util.*;
public class thread extends Thread{
public static void main(String[]args)
{
	thread t1=new thread();
	thread t2=new thread();
	thread t3=new thread();
	t1.start();
	t2.start();
	t3.start();
}
public void run ()
{
	long duration=5000;
	long startTime = System.currentTimeMillis();
	Random random = new Random();
	while (System.currentTimeMillis() - startTime < duration) {
        
        int randomNumber = random.nextInt(100); 
       
        System.out.println("Random Number: " + randomNumber);
        if (randomNumber % 2 == 0) {
            int squaredNumber = randomNumber * randomNumber;
            System.out.println("Squared Number: " + squaredNumber);
        } else {
            int cubedNumber = randomNumber * randomNumber * randomNumber;
            System.out.println("Cubed Number: " + cubedNumber);
        }
    }
}
}
