package java_internal_questions;

import java.util.Scanner;

public class greatest_of_3_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first number:");
	int a=scan.nextInt();
	System.out.println("enter the second number:");
	int b=scan.nextInt();
	System.out.println("enter the third number:");
	int c=scan.nextInt();
	if(a>b && a>c) {
		System.out.printf("%d  is greater",a);
	}
	else if (b>c && b>a) {
		System.out.printf("%d is greater",b);
	}
	else {
		System.out.printf("%d is greater",c);
	}

	

	}

}
