package internal;
import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		String n=Integer.toString(num);
		String n1="";
		char s;
		for(int i=0;i<n.length();i++) {
			s=n.charAt(i);
			n1=s+n1;
		}
		System.out.println(n1);
		if(n.equals(n1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}