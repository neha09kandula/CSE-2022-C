package cse225h8;
import java.util.Scanner;
public class throwTrycatch{
	public static void main(String [] args) {
	int age;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your age: ");
	age = input.nextInt();
	input.close();
	try {
		if(age<5) {
			throw new ArithmeticException("Not allowed. Your age is less than 5.");
	}
		else if(age>20){
			throw new ArithmeticException("Not allowed. your age is greater than 20.");
		}
		else {
			System.out.println("Welcome!");
		}
	}
	catch(ArithmeticException e){
		System.out.println("An exception is thrown.");
		System.out.println(e.getMessage());
	}
	System.out.println("--------------------------------------------");
	System.out.println("Rest of the code.");
	
	}
}
