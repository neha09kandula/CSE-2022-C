package internal;
import java.lang.*;
import java.util.*;
public class palindrome {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
		String s1=sc.next();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev =rev+s1.charAt(i);
		}
		if(s1.equals(rev))
			System.out.println("given string is palindrome");
		else
			System.out.println("given string is not a palindrome");
		
	}

}
