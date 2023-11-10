import java.util.*;
public class pat
{
	public static void main(String args[])
  	{
		System.out.print("enter number of patterns required");
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		int i,j;
		for(i=0;i<=n;i++)
		{
		for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println("\n");
		}
	}
}	