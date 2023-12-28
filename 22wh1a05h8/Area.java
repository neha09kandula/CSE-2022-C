

import java.util.Scanner;

class Area {
    private double radius;
    private double length;
    private double width;

 
    public Area(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

 
    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }


    public double calculateRectangleArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius, length, and width (separated by commas): ");
        String input = scanner.nextLine();

   
        String[] values = input.split(",");

   
        double radius = Double.parseDouble(values[0].trim());
        double length = Double.parseDouble(values[1].trim());
        double width = Double.parseDouble(values[2].trim());

        Area areaCalculator = new Area(radius, length, width);

        double circleArea = areaCalculator.calculateCircleArea();
        double rectangleArea = areaCalculator.calculateRectangleArea();

        System.out.printf("Area of circle with radius %.2f is: %.2f%n", radius, circleArea);
        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f%n", length, width, rectangleArea);

        scanner.close();
    }
}
