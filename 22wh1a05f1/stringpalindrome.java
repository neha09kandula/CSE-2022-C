package internal;

import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			String str1=sc.nextLine();
			for(int i=0;i<str1.length()-1;i++)
			{
				if(str1.charAt(i)!=str1.charAt(str1.length()-1-i))
				{
					System.out.println("It is not a palindrome");
				}
				else {
					System.out.println("It is a palindrome");
				}
			}
		}
}