package lab_questions;
import java.util.*;

public class GreatestNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		
		System.out.println("1st number:");
		double num1=sc.nextDouble();
		
		System.out.println("2nd number:");
		double num2=sc.nextDouble();
		
		System.out.println("3rd number:");
		double num3=sc.nextDouble();
		
		System.out.println("Greatest number is:");
		
		if(num1>num2 & num1>num3)
		{
			System.out.println(num1);
		}
		else if(num2>num1 & num2>num3)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}
	}
}
