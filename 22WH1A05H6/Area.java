package csec;
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
	        System.out.println("Rectangle Area: " + area);
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
	        System.out.println("Triangle Area: " + area);
	    }
	}
	class Circle implements Shape {
	    private int radius;
	    public Circle(int radius) {
	        this.radius = radius;
	    }

	    public void printArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Circle Area: " + area);
	    }
	}
	public class Area {
		public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 10);
	        Triangle triangle = new Triangle(8, 6);
	        Circle circle = new Circle(4);
	        rectangle.printArea();
	        triangle.printArea();
	        circle.printArea();
	    }
	}


