package labprograms;
import java.util.*;
public class palindrome {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string for palindrome test");
	String s=scan.nextLine();
	int len=s.length();
	String rev="";
	char ch;
	for(int i=len-1;i>0;i--)
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
