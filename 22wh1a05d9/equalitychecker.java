package javapractice;
import java.util.Scanner;
public class EqualityChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter the third integer: ");
	        int num3 = scanner.nextInt();
	        System.out.print("Enter the fourth integer: ");
	        int num4 = scanner.nextInt();
	        if (num1 == num2 && num2 == num3 && num3 == num4) {
	            System.out.println("Equal");
	        } else {
	            System.out.println("Not equal");
	        }
	        
	        scanner.close();
	    }
	}