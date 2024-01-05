package csec;
import java.util.Scanner;
public class Area_2 {
	    private double radius;
	    private double length;
	    private double width;
	    public Area_2(double radius, double length, double width) {
	        this.radius = radius;
	        this.length = length;
	        this.width = width;
	    }
	    public double carea() {
	        return Math.PI * radius * radius;
	    }
	    public double rarea() {
	        return length * width;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter radius, length, and width: ");
	        double radius = scanner.nextDouble();
	        double length = scanner.nextDouble();
	        double width = scanner.nextDouble();
	        scanner.close();
	        Area_2 areaCalculator = new Area_2(radius, length, width);
	        double circleArea = areaCalculator.carea();
	        System.out.printf("Area of circle with radius %.2f is: %.2f\n", radius, circleArea);
	        double rectangleArea = areaCalculator.rarea();
	        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f\n", length, width, rectangleArea);
	    }
	}
