package cse225e4;
import java.io.File;
import java.io.IOException;
public class Exceptionhandling {
	public static void main(String args[]){
		int val1, val2;
		try {
		System.out.println("Try Block:: Start");
		val1 = 0;
		val2 = 25 / val1;
		System.out.println(val2);
		System.out.println("Try Block:: End");
		}
		catch (ArithmeticException e) {
		//handler for ArithmeticException
		System.out.println("ArithmeticException:: Divide by Zero!!");
		}
		System.out.println("Outside try-catch::Rest of the code.");
		}
	}		
