package 225e3;
import java.util.Scanner;

public class Area {
    private double radius;
    private double length;
    private double width;

    // Constructor
    public Area(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of a circle
    public double carea() {
        // Calculate the area of a circle using the formula: π * r^2
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the area of a rectangle
    public double rarea() {
        // Calculate the area of a rectangle using the formula: length * width
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter radius, length, and width separated by commas: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Create an instance of the Area class
        Area areaInstance = new Area(radius, length, width);

        // Calculate and print the area of the circle
        double circleArea = areaInstance.carea();
        System.out.printf("Area of circle with radius %.2f is: %.2f\n", radius, circleArea);

        // Calculate and print the area of the rectangle
        double rectangleArea = areaInstance.rarea();
        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f\n", length, width, rectangleArea);

        // Close the scanner
        scanner.close();
    }
}
