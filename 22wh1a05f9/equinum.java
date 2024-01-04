package vvvvvv;
import java.util.Scanner;
public class equinum {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int num4=input.nextInt();
		input.close();
		if(num1==num2 && num2==num3 && num3==num4)
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
}
}
