package farhana;
import java.util.Scanner;

class internal_3 {
     double radius;
    double length;
    double width;

    public internal_3(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    public double carea() {
        return Math.PI * Math.pow(radius, 2);
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

        internal_3 area = new internal_3(radius, length, width);

        double circleArea = area.carea();
        double rectangleArea = area.rarea();

        System.out.printf("Area of circle with radius %.2f is: %.2f\n", radius, circleArea);
        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f\n", length, width, rectangleArea);

        scanner.close();
    }
}
