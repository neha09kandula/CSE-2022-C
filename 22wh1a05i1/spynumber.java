import java.util.*;
public class SPYNUMBER {

	public static void main(String args[])
	{
		System.out.println("Enter a number to check for SPYNUMBER");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int s=0,m=0;
		int p=1;
		while(n!=0)
		{
			m=n%10;
			s=s+m;
			p=p*m;
			n=n/10;
		}
		if(s==p)
		{
			System.out.println("TRUE");
			System.out.println("It is a SPYNUMBER");
		}
		else
		{
			System.out.println("FALSE");
			System.out.println("It is not a SPYNUMBER");
		}
			
	}

}