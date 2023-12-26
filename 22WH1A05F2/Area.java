import java.util.*;
class Area {
    private double radius;
    private double length;
    private double width;
    public Area(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }
    public double carea() {
        return 3.14 * radius * radius;
    }
    public double rarea() {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius, length, and width: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Area areaCalculator = new Area(radius, length, width);
        double circleArea = areaCalculator.carea();
        System.out.println("Area of circle with radius " + radius + " is: " + circleArea);
        double rectangleArea = areaCalculator.rarea();
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + rectangleArea);
    }
}
