package labprograms;
import java.util.*;
public class main1 {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printArea();

        Triangle triangle = new Triangle(3, 6);
        triangle.printArea();

        Circle circle = new Circle(3);
        circle.printArea();
    }
}
//Shape interface
interface Shape {
 void printArea();
}

//Rectangle class implementing Shape
class Rectangle implements Shape {
 private int length;
 private int width;

 public Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void printArea() {
     System.out.println("Rectangle Area: " + (length * width));
 }
}

//Triangle class implementing Shape
class Triangle implements Shape {
 private int base;
 private int height;

 public Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public void printArea() {
     System.out.println("Triangle Area: " + (0.5 * base * height));
 }
}

//Circle class implementing Shape
class Circle implements Shape {
 private int radius;

 public Circle(int radius) {
     this.radius = radius;
 }

 @Override
 public void printArea() {
     System.out.println("Circle Area: " + (Math.PI * radius * radius));
 }
}


