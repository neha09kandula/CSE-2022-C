package cse_c_lab_internal;
import java.util.Scanner;

public class SpyNum {
	
	public static void main(String[] args)
	{
	Scanner b = new Scanner(System.in);
	System.out.println("enter n value:");
	 int n= b.nextInt();
	 int t=n;
	 int s=0;
	 int p=1;
		int r;
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println("sum of given number is"+s);
		while(t>0)
		{
			r=t%10;
			p=r*p;
			t=t/10;
		}
		System.out.println("product of given number is:"+p);
		if(s==p)
			System.out.println("The number is SPYNUMBER");
		else
			System.out.println("The number is not SPYNUMBER");
	}

}
