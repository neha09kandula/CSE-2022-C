package ExceptionHandling;

public class exception 
{
	public static void main(String[] args)
	{
		try
		{
			int[] MyNumber = {1,2,3};
			System.out.println(MyNumber[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
	}
}