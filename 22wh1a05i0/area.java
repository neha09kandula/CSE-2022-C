package java_programs;
import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        // Input for circle
		        System.out.print("Enter the radius of the circle: ");
		        double radius = scanner.nextDouble();

		        // Input for rectangle
		        System.out.print("Enter the length of the rectangle: ");
		        double length = scanner.nextDouble();
		        System.out.print("Enter the width of the rectangle: ");
		        double width = scanner.nextDouble();

		        // Calculate and display area of circle
		        double circleArea = carea(radius);
		        System.out.println("Area of the circle: " + circleArea);

		        // Calculate and display area of rectangle
		        double rectangleArea = rarea(length, width);
		        System.out.println("Area of the rectangle: " + rectangleArea);

		        scanner.close();
		    }

		    // Method to calculate area of circle
		    static double carea(double radius) {
		        return Math.PI * radius * radius;
		    }

		    // Method to calculate area of rectangle
		    static double rarea(double length, double width) {
		        return length * width;
		    }
}