package lab_questions;

import java.util.Scanner;

class Area {
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
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double rarea() {
        return length * width;
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        // Create an object of the Area class
        Area areaObj = new Area(radius, length, width);

        // Calculate and display the area of the circle
        double circleArea = areaObj.carea();
        System.out.printf("Area of circle with radius %.2f is: %.2f\n", radius, circleArea);

        // Calculate and display the area of the rectangle
        double rectangleArea = areaObj.rarea();
        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f\n", length, width, rectangleArea);

    }
}

