import java.util.*;
public class large
{
	public static void main(String args[])
	{
		System.out.println("enter number a");
		Scanner x=new Scanner(System.in);
		int a =x.nextInt();
		System.out.println("enter number b");
		Scanner y=new Scanner(System.in);
		int b = y.nextInt();
		System.out.println("enter number c");
		Scanner z=new Scanner(System.in);
		int c = z.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is larger"+a);
		}
		else if(b>c)
		{
			System.out.println("b is larger"+b);
		}
		else
		{
			System.out.println("c is larger"+c);
		}
	}
}