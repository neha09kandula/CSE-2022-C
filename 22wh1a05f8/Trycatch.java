package cse_225f8;

public class Trycatch {
	public static void main(String args[])
	{
		try
		{
			int a=0;
			int b=32/a;
			System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This will not execute");
		}
		finally
		{
			System.out.println("this is final block");
		}
	}
}

