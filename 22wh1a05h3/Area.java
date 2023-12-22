package cseb;

import java.util.*;
public class Area {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of radius");
	Double radius = scan.nextDouble();
	System.out.println("enter the value of length");
	Double length=scan.nextDouble();
	System.out.println("enter the value of width");
	Double width = scan.nextDouble();
	scan.close();
	carea(radius);
	rarea(length,width);
}
 static void carea(double radius)
{
	Double result1;
	result1=3.14*radius*radius;
	System.out.println("Area of circle with radius 4.50 is:"+result1);
}
static void rarea(double lenght, double width)
{
	Double result2;
	result2=lenght*width;
	System.out.println("Area of rectangle with length 12.20 and width 6.40 is:"+result2);
}
}



