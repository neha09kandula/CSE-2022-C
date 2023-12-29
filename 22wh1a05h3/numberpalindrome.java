package labprograms;
import java.util.*;
public class numberpalindrome {
public static void main(String[]args)
{
	System.out.println("enter the integer number for palindrome check");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	scan.nextLine();
	String s = Integer.toString(a);
	int len=s.length();
	String rev="";
	char ch;
	for(int i=len-1;i>=0;i--)
	{
		
		ch=s.charAt(i);
		rev=rev+ch;
	}
	if(s.equals(rev))
	{
		System.out.println("palindrome");
	
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
