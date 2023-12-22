package cse225f2_internal;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int num1 = num;
		while(num%10!=0)
		{
			temp = num%10;
			rev = rev*10+temp;
			num = num/10;
		}
		if (num1==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
