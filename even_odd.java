import java.util.*;
public class even_odd
{
public static void main(String args[])
{
	System.out.println("enter a number");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	if(num%2==0)
	{
		System.out.println("it is even");
	}
	else
	{
		System.out.println("it is odd");
	}
}
}