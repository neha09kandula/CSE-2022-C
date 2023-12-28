package programs;

import java.util.*;
public class spynumber {
	public static void main(String args[])
	{
		Scanner  input=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=input.nextInt();
		int sum=0,ld,product = 1;
		while (n>0)
		{
			ld=n%10;
			sum=sum+ld;
			product =product*ld;
			n=n/10;
		}
		if(sum==product)
			System.out.println("The number is a spy number");
		else
			System.out.println("The number is not a spy number");
		input.close();
	}
}
