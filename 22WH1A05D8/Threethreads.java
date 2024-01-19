package frames;
import java.util.Random;
class Square extends Thread
{
	 int x;
	 Square(int n)
	 {
		 x = n;
	 }
	 public void run()
	 {
	 if (x % 2 == 0) {
		 int sqr = x * x;
		 System.out.println("Square of " + x + " = " + sqr );
		 }
	 }
}
class Cube extends Thread
{
	 int x;
	 Cube(int n)
	 {
		 x = n;
	 }
	 public void run()
	 {
		 if(x % 2 != 0) {
			 int cub = x * x * x;
			 System.out.println("Cube of " + x + " = " + cub );
		 }
	 }
}
class Number extends Thread
{
	 public void run()
	 {
		 Random t1 = new Random();
		 for(int i =0; i<10; i++)
		 {
			 int randomInteger = t1.nextInt(100);
			 System.out.println("Random Integer generated : " + randomInteger);
			 Square t2 = new Square(randomInteger);
			 t2.start();
			 Cube t3 = new Cube(randomInteger);
			 t3.start();
			 try {
				 Thread.sleep(100);
			
			 } catch (InterruptedException ex) {
				 System.out.println(ex);
			}
		 }
	 }
}
public class Threethreads {
	 public static void main(String args[])
	 {
		 new Number().start();
		 
	 }
}