package programs;
import java.util.*;
public class String_palindrome {
	public static void main(String []args)
	{
		String rev="";
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s=in.nextLine();
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		if (s.equals(rev))
			System.out.println("Given string is a palindrome ");
		else
			System.out.println("Given string is not a palindrome ");
		in.close();
	}
}