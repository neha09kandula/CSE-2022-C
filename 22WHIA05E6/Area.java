package java_internal_questions;

import java.util.Scanner;

public class Area {
	public double carea(double r) {
		
		return Math.PI*r*r;
	}
	public double rarea(double l,double w) {
		
		return l*w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius:");
		 double r = scan.nextDouble();
		 System.out.println("Enter length:");
		 double l = scan.nextDouble();
		 System.out.println("Enter width:");
		 double w = scan.nextDouble();
		 Area circlearea=new Area();
		 double  circleresult=circlearea.carea(r);
		 System.out.println("Area of circle is:"+ circleresult);
		 
		 
		 Area rectangulararea=new Area();
		 double rectangularresult=rectangulararea.rarea(l,w);
		 System.out.println("Area of rectangle is:"+ rectangularresult);
		 
		 
	}

}
