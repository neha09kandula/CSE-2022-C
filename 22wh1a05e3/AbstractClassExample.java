package java_5e3;
abstract class Shape {
 public abstract double calculateArea();
 public void display() {
     System.out.println("This is a shape.");
 }
}
class Circle extends Shape {
 private double radius;
 public Circle(double radius) {
     this.radius = radius;
 }
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 public double calculateArea() {
     return length * width;
 }
}

public class AbstractClassExample {
 public static void main(String[] args) {
     Circle circle = new Circle(5.0);
     Rectangle rectangle = new Rectangle(4.0, 6.0);

     System.out.println("Circle Area: " + circle.calculateArea());
     circle.display();

     System.out.println("Rectangle Area: " + rectangle.calculateArea());
     rectangle.display();
 }
}
