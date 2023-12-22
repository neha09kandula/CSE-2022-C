package cse22523;
import java.util.*;
public class executingThrow {
	
	private static void throwException(int a) {
		if(a%2!=0) {
			throw new ArithmeticException("You entered an odd number.");
		}
		else {
			System.out.println("No exceptions found. The number entered is even number.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		throwException(num);
		input.close();
	}

}
