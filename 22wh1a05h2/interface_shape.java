package programs;

import java.util.*;

interface Shape{

	Scanner sc = new Scanner(System.in);

    void printArea();

	

}

class Circle implements Shape{

	public void printArea(){

		System.out.println("Enter x value: ");

		int x = sc.nextInt();

		float pi = sc.nextFloat();

		float result=(pi * x * x);

		System.out.println(result);

	}

}

class Rectangle implements Shape{

	public void printArea() {

		System.out.println("Enter x and y value: ");

		int x = sc.nextInt();

		int y = sc.nextInt();

		int result = x*y;

		System.out.println(result);

	}

}

class Triangle implements Shape{

	   public void  printArea(){

		System.out.println("Enter x and y value: ");

		int x = sc.nextInt();

		

		int y = sc.nextInt();

		float result = x * y;

		System.out.println(result);

	}

}

class Answer{

	public static void main(String [] args) {

		Circle obj1 = new Circle();

		Rectangle obj2 = new Rectangle();

		Triangle obj3 = new Triangle();

		System.out.println("Area of circle: ");

		obj1.printArea();

		System.out.println("Area of rectangle: ");

		obj2.printArea();

		System.out.println("Area of triangle: ");

		obj3.printArea();

	}

}

