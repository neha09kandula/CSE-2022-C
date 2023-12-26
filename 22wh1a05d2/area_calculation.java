package cse_c;

//public class area_calculation{
	import java.util.Scanner;
	public class area_calculation {
	    private double radius;
	    private double length;
	    private double width;

	    public area_calculation(double radius, double length, double width) {
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
	

	//public class area_calculation{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter radius, length, and width separated by commas: ");
	        String[] input = scanner.nextLine().split(",");
	        
	        double radius = Double.parseDouble(input[0].trim());
	        double length = Double.parseDouble(input[1].trim());
	        double width = Double.parseDouble(input[2].trim());

	        area_calculation areaObj = new area_calculation(radius, length, width);

	        System.out.printf("Area of circle with radius %.2f is: %.2f\n", radius, areaObj.carea());

	        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f\n", length, width, areaObj.rarea());

	        scanner.close();
	    }
	}


