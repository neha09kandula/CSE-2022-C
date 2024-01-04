package programs;
import java.util.*;
public class Numberpalindrome {
	public static int reverse(int a)
	{
		int rev=0;
		while (a>0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		return rev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=in.nextInt();
		int r=reverse(n);
		if(n==r)
			System.out.print("The number " + n +" is a palindrome ");
		else
			System.out.print("The number " + n +" is not a palindrome ");
			
		in.close();	
	}

}