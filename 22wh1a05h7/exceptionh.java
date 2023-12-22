package csec_labinternal1;
import java.util.*;
public class exceptionh {
	public static void main(String []args)
	{
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		a=in.nextInt();
		try
		{
			System.out.println("Enter the second number");
			b=in.nextInt();
			int c=a/b;
			System.out.println("Quotient is : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong");
			System.out.println("Division by zero error");
		}
		in.close();
	}
}
