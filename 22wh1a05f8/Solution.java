package my_java_projects;

import java.util.*;
public class Solution {
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

