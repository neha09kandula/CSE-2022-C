package javaprogrames;
import java.util.Random;
public class Generator extends Thread {
	public static void main(String[] args) {
		Generator t1= new Generator();
		Generator t2= new Generator();
		Generator t3= new Generator();
		t1.start();
		t2.start();
		t3.start();	
	}
	public void run() {
	Random random = new Random();	
	for(int i=0;i<=9;i++)
	{
		 int number = random.nextInt(6);
		 System.out.println("Thread t1 " + " generated: " + number);

         if (number % 2 == 0) {
             squareNumber(number);
         }
         else {
             cubeNumber(number);
         }
	}
	}
         public void squareNumber(int number) {
             System.out.println("Thread t2" + " squared: " + (number * number));
         }

         public void cubeNumber(int number) {
             System.out.println("Thread t3" + " cubed: " + (number * number * number));
	}
	}




