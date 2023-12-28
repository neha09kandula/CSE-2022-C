package my_java_projects;

import java.util.Scanner;

public class num_palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int r=0;
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			sum = sum*10+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
}
}
