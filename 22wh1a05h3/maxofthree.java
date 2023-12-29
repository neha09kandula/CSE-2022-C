package labprograms;
import java.util.*;
public class maxofthree {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the value of first number");
	int a=scan.nextInt();
	System.out.println("enter the value of second number");
	int b=scan.nextInt();
	System.out.println("enter the value of third number");
	int c=scan.nextInt();
	scan.close();
	if(a>b && b>c)
	{
		System.out.println("greatest number is"+a);
	}
	else if(b>c)
	{
		System.out.println("greatest number is"+b);
	}
	else
	{
		System.out.println("greatest number is"+c);
	}
}
}
