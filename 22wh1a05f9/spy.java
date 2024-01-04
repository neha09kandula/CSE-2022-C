package vvvvvv;
/*8. Write a Java program to check whether the given non-negative number is SPYNUMBER
or not. A SPYNUMBER is a number where the sum of its digits equals the product of its
digits. If the number is SPYNUMBER print true else print false.
Ex: 1124 is SPYNUMBER, because the sum of its digits(1+1+2+4) = 8 and the product of
its digits (1*1*2*4) = 8 is equal.*/

import java.util.Scanner;

public class spy {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		int rev;
		int sum=0;
		int product=1;
		while(num!=0)
		{
			rev=num%10;
			product=product*rev;
			sum=sum+rev;
			num=num/10;
		}
		
		
		if(sum==product)
		{
			System.out.println("SPYNUMBER");
		}
		else
		{

			System.out.println("NOT SPYNUMBER");
		}
	
}
}
