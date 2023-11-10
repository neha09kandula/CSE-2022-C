import java.util.*;
public class div
{
	public static void main(String args[])
	{
		System.out.println("enter your number:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num%5==0)
		{
			System.out.println("it is divisible by 5");
		}		
		else
		{
		        System.out.println("it is not divisible by 5");
		}
	}
}