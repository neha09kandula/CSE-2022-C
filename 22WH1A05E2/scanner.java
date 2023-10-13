package day_1;
import java.util.*;
public class scanner {
	public static void main(String args[])
	{
		System.out.println("student details");
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name :");
		String name=input.nextLine();
		System.out.println("my name is "+name);
		System.out.println("enter your age :");
		int age=input.nextInt();
		System.out.println("my age is "+age);
		System.out.println("enter your phone number :");
		long phn_no=input.nextLong();
		System.out.println("my phone number is " +phn_no);
		System.out.println("enter your email id :");
		String email=input.nextLine();
		System.out.println(email + "my email id is ");
		input.close();
	}

}