package programs;
import java.util.*;
import java.io.IOException;
public class ehallkeywords {
	void met(int num)throws IOException
	{
		if(num<10)
			throw new ArithmeticException("Number is incorrect");
	}
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=in.nextInt();
		try
		{
			ehallkeywords o=new ehallkeywords();
			o.met(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("This is finally block");
		}
		in.close();
		
	}
}
