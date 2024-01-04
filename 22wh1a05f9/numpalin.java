package vvvvvv;
import java.util.Scanner;
public class numpalin {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		int temp=num;
		int sum=0;
		int rev=0;
		while(num!=0)
		{
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
}
}

