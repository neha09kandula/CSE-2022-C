package cse_c;
import java.util.Scanner;
public class three_greatest_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the first number: ");
	    double num1 = scanner.nextDouble();

	    System.out.print("Enter the second number: ");
	    double num2 = scanner.nextDouble();

	    System.out.print("Enter the third number: ");
	    double num3 = scanner.nextDouble();

	    scanner.close();

	    double greatestNumber = findGreatestNumber(num1, num2, num3);

	    System.out.println("The greatest number is: " + greatestNumber);
	    }

	    private static double findGreatestNumber(double a, double b, double c) {
	        if (a >= b && a >= c) {
	            return a;
	        } else if (b >= a && b >= c) {
	            return b;
	        } else {
	            return c;
	        }
	    }
	}

