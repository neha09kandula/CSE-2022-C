import java.util.*;
public class factofnum
{
	public static void main(String args[])
	{
		System.out.println("enter number n");
		Scanner x=new Scanner(System.in);
		int n =x.nextInt();
		int i,f=1;
		for (i=n;i>0;i--)
		{
			f=f*i;
		}
		System.out.println(f);	
	}
}