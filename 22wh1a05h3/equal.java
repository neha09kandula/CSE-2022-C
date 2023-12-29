package labprograms;
import java.util.*;
public class equal {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the first number");
	int a= scan.nextInt();
	System.out.println("enter the second number");
	int b= scan.nextInt();
	System.out.println("enter the third number");
	int c= scan.nextInt();
	System.out.println("enter the fourth number");
	int d= scan.nextInt();
	scan.close();
	if(a==b && b==c && c==d)
	{
		System.out.println("all are equal");
	}
	else
	{
		System.out.println("all are not equal");
	}
}
}
