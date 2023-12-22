

public class trycatch {
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero");			
		}
		finally {
			System.out.println("This gets printed always!");
		}	
	
	}
}

