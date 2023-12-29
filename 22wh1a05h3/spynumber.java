package labprograms;
import java.util.*;
public class spynumber {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number for spy check");
	int num=scan.nextInt();
	int sum=0;
	int pro=1;
	String s = Integer.toString(num);
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		int cha = Character.getNumericValue(s.charAt(i));
		sum=sum+cha;
	}
	for(int i=0;i<len;i++)
	{
		int cha = Character.getNumericValue(s.charAt(i));
		pro=pro*cha;
	}
	if(sum==pro)
	{
		System.out.println("spynumber");
	}
	else
	{
		System.out.println("not a spynumber");
	}
}
}
