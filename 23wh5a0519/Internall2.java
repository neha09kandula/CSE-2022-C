package framework;

public class Internall2 {
		
		interface Shape {
		    void printArea();
		}

		class Rectangle implements Shape {
		    private int length;
		    private int width;

		    public Rectangle(int length, int width) {
		        this.length = length;
		        this.width = width;
		    }

		 
		    public void printArea() {
		        int area = length * width;
		        System.out.println("Area of Rectangle: " + area);
		    }
		}

		class Triangle implements Shape {
		    private int base;
		    private int height;

		    public Triangle(int base, int height) {
		        this.base = base;
		        this.height = height;
		    }

		   
		    public void printArea() {
		        double area = 0.5 * base * height;
		        System.out.println("Area of Triangle: " + area);
		    }
		}

		class Circle implements Shape {
		    private int radius;

		    public Circle(int radius) {
		        this.radius = radius;
		    }

		   
		    public void printArea() {
		        double area = Math.PI * radius * radius;
		        System.out.println("Area of Circle: " + area);
		    }
		}

		
		 public static void main(String[] args) {
		        Rectangle rectangle = new Rectangle(5, 10);
		        Triangle triangle = new Triangle(4, 6);
		        Circle circle = new Circle(7);

		        rectangle.printArea();
		        triangle.printArea();
		        circle.printArea();
		 }
		}
		



