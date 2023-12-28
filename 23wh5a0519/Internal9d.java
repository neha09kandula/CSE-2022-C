package framework;
import java.util.Scanner;
public class Internal9d {
		
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

		boolean areEqual = areAllEqual(num1, num2, num3, num4);

		if (areEqual) {
		System.out.println("Equal");
		} else {
		System.out.println("Not Equal");
		}

		}
		static boolean areAllEqual(int num1, int num2, int num3, int num4) {
		return num1 == num2 && num2 == num3 && num3 == num4;
		}
		
	}


