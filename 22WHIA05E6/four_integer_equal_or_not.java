package java_internal_questions;

import java.util.Scanner;

public class four_integer_equal_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=scan.nextInt();
		System.out.println("Enter second number:");
		int b=scan.nextInt();
		System.out.println("Enter third number:");
		int c=scan.nextInt();
		System.out.println("Enter fourth number:");
		int d=scan.nextInt();
		if(a==b && b==c && c==d) {
			System.out.println("all are equal");
		}
		else {
			System.out.println("all are not equal");
		}

	}

}
