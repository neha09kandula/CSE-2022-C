import java.util.*;
public class evenorodd
{
	public static void main(String args[])
	{
		System.out.print("enter any number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%2==0)
		{
			System.out.println("numver is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}