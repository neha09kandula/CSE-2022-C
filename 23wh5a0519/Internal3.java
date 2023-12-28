package framework;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Internal3 {

	 

		class Area {
		    private double radius;
		    private double length;
		    private double width;

		    public Area(double radius, double length, double width) {
		        this.radius = radius;
		        this.length = length;
		        this.width = width;
		    }

		    public void carea() {
		        double areaCircle = Math.PI * radius * radius;
		        DecimalFormat df = new DecimalFormat("#.##");
		        System.out.println("Area of circle with radius " + df.format(radius) + " is: " + df.format(areaCircle));
		    }

		    public void rarea() {
		        double areaRectangle = length * width;
		        DecimalFormat df = new DecimalFormat("#.##");
		        System.out.println("Area of rectangle with length " + df.format(length) + " and width " + df.format(width) + " is " + df.format(areaRectangle));
		    }
		}

		   public class  Internal3 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter radius: ");
		        double radius = scanner.nextDouble();

		        System.out.print("Enter length: ");
		        double length = scanner.nextDouble();

		        System.out.print("Enter width: ");
		        double width = scanner.nextDouble();

		        Area areaObj = new Area(radius, length, width);
		        areaObj.carea();
		        areaObj.rarea();

		        scanner.close();
		    }
		

	


