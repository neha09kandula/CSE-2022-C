package csec_5g0;
import java.util.*;
import java.lang.*;

public class Area {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius:");
		double radius=sc.nextDouble();
		System.out.println("enter length:");
		double length=sc.nextDouble();
		System.out.println("enter width:");
		double width=sc.nextDouble();
		Area obj=new Area();
		obj.carea(radius);
		obj.rarea(length,width);
	}

	void carea(double radius) {
		double result=Math.PI*radius*radius;
		System.out.println("Area of circle is "+result);
	}
	void rarea(double length,double width) {
		double result=length*width;
		System.out.println("Area of rectangle is "+result);
	}
	
}
