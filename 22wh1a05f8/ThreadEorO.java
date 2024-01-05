package cse_c_225f8;

import java.util.*;
public class ThreadEorO {
public void even(int n)
{
	System.out.println(n*n);
}
public void odd(int n)
{
	System.out.println(n*n*n);
}
	public static void main (String args[])
{
	ThreadEorO t=new ThreadEorO();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	
		if(n%2==0)
		{
			System.out.println("it is even");
			t.even(n);
		}
		else
		{
			System.out.println("it is odd");
			t.odd(n);
		}
	}

}
