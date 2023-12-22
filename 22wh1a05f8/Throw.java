package cse_225f8;

import java.util.Scanner;

public class Throw {
	public void display()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age:");
	int i=sc.nextInt();
	if(i<18)
	{
		throw new ArithmeticException("You are not eligible to use this app");
	}
	else
		System.out.println("you are eligible");
	}
	public static void main(String [] args)
	{
		Throw ob1=new Throw();
		ob1.display();
		
	}

}
