package cse225g2_lab_internal_1;

import java.util.Scanner;

public class solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("The greatest number is: " + a);
		}
		else if(b>a && b>c) {
			System.out.println("The greatest number is: " + b);
		}
		else {
			System.out.println("The greatest number is: " + c);
		}
	}
}