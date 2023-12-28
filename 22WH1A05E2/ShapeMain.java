package lab_questions;
import java.util.*;

//Define the Shape interface
interface Shape {
 void printArea();
}

//Rectangle class implementing Shape interface
class Rectangle implements Shape {
 private int length;
 private int width;

 public Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void printArea() {
     int area = length * width;
     System.out.println("Area of Rectangle: " + area);
 }
}

//Triangle class implementing Shape interface
class Triangle implements Shape {
 private int base;
 private int height;

 public Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public void printArea() {
     double area = 0.5 * base * height;
     System.out.println("Area of Triangle: " + area);
 }
}

//Circle class implementing Shape interface
class Circle implements Shape {
 private int radius;

 public Circle(int radius) {
     this.radius = radius;
 }

 @Override
 public void printArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}

//Main class to test the Shape interface and classes
public class ShapeMain {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     // Get user input for Rectangle dimensions
     System.out.print("Enter length of Rectangle: ");
     int rectangleLength = sc.nextInt();
     System.out.print("Enter width of Rectangle: ");
     int rectangleWidth = sc.nextInt();
     Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

     // Get user input for Triangle dimensions
     System.out.print("Enter base of Triangle: ");
     int triangleBase = sc.nextInt();
     System.out.print("Enter height of Triangle: ");
     int triangleHeight = sc.nextInt();
     Triangle triangle = new Triangle(triangleBase, triangleHeight);

     // Get user input for Circle dimensions
     System.out.print("Enter radius of Circle: ");
     int circleRadius = sc.nextInt();
     Circle circle = new Circle(circleRadius);

     // Call printArea() for each shape
     rectangle.printArea();
     triangle.printArea();
     circle.printArea();
 }
}
