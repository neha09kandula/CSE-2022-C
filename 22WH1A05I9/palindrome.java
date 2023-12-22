package internal;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to check for palindrome");
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		int i;
		String s2=" ";
		for(i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
			
		}
		System.out.println("Reversed String"+s2);
		if(s.equals(s2))
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is NOt a palindrome number");
		}

	}

}
