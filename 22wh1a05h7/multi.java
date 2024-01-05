package programs;

import java.util.Random;
import java.util.Scanner;
class Square extends Thread
{
 int x;
 Square(int n)
 {
 x = n;
 }
 public void run()
 {
 int sqr = x * x;
 System.out.println("Square of " + x + " = " + sqr );
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
 int cub = x * x * x;
 System.out.println("Cube of " + x + " = " + cub );
 }
}
class Number extends Thread
{
 public void run()
 {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the number ");
	 int na=in.nextInt();
 Random random = new Random();
 for(int i =0; i<na; i++)
 {
 int randomInteger = random.nextInt(20);
 System.out.println("Random Integer generated : " + randomInteger);
 if(randomInteger % 2==0) {
 Square s = new Square(randomInteger);
 s.start();
 }
 else {
 Cube c = new Cube(randomInteger);
 c.start();
 }
 try {
 Thread.sleep(1000);
 } catch (InterruptedException ex) {
 System.out.println(ex);
}
 }
 }
}
public class multi {
 public static void main(String args[])
 {
 Number n = new Number();
 n.start();
 }
}
