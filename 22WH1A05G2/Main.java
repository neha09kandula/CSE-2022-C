package cse225g2;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		System.out.println("Enter the number: ");
		int b = sc.nextInt();
		System.out.println("Enter the number: ");
		int c = sc.nextInt();
		if(a>=b && a>=c)  {
			System.out.println(a+" is the largest Number");
		}
		else if (b>=a && b>=c)  {
			System.out.println(b+" is the largest Number");
		}
		else {
			System.out.println(c+" is the largest number");
		}
		sc.close();
	}
}
