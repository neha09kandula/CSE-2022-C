package javaprograms;
import java.util.*;

public class Concatenation {
	public static void main(String args[])
	{
		System.out.println("Enter any two strings");
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		String s=s1.concat(s2);
		System.out.println("Concatenated String: "+s);
		
	}

}
