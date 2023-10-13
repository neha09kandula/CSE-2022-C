import java.util.*;
public class max_three
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		{
			if (a>b)
				{
					if(a>c)
						{
							System.out.println("a is largest");
						}
					else
						{
							System.out.println("c is largest");
						}
				}
			else
				{
				if(b>c)
				{
					System.out.println("b is largest");
				}
				else
				{
					System.out.println("c is largest");
				}
				}
		}
	}
}