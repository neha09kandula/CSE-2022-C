package exception;

public class exception {
	static void check_age(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access Denied: age is not sufficient");
		}
		else
		{
			System.out.println("Access Granted");
		}
	}
	public static void main(String args[])
	{
		int a,b;
		try {
			System.out.println("Start of Try block");
			a=2 ;
			b=12;
			int c=b/a;
			System.out.println("Result:"+c);
			System.out.println("End of try block");
		}
		catch(Exception e)
		{
			System.out.println("Start of Catch block");
			System.out.println("Division by zero error");
			System.out.println("End of Catch Block");
		}
		finally
		{
			System.out.println("All the statements executed");
		}
		check_age(19);
	}

}
