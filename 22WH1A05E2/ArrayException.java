package ExceptionHandling;

public class ArrayException {
	public static void main(String args[])
	{
		try
		{
			int[] myNumber= {1,2,3,4,5};
			System.out.println(myNumber[10]);
		}
		catch(Exception e)
		{
			System.out.println("Array Out Of Bound");
		}
	}
}