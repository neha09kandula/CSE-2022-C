package ExceptionHandling;
import java.util.*;
class Division {
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("Enter the value of c:");
		int c=sc.nextInt();
		
        int result;
        try
        {
            result = a / (b - c);
            System.out.println("result:" + result);
        }
 
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught is DivisionByZero");
        }
 
        finally
        {
            System.out.println("Exception is handled");
        }
    }
}