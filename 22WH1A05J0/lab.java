package priyanka;
/*(b) Write a java program to check whether the given string is palindrome or not ?*/
import java.util.Scanner;

public class lab {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		int l=str.length();
		String rev_str="";
		for(int i=(l-1);i>=0;i--)
		{
	        rev_str= rev_str+str.charAt(i);
		}
		if(str.equals(rev_str))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
}
}
