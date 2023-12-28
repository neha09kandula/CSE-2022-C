package csec;
import java.util.Scanner;
public class Main_b {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        double num3 = scanner.nextDouble();
	        scanner.close();
	        double greatestNumber = findGreatestNumber(num1, num2, num3);
	        System.out.println("The greatest number is: " + greatestNumber);
	    }
	    private static double findGreatestNumber(double a, double b, double c) {
	        return Math.max(Math.max(a, b), c);
	    }
	}
