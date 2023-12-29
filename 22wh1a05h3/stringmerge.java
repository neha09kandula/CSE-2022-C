package labprograms;
import java.util.*;
public class stringmerge {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your first string");
	String s1=scan.nextLine();
	System.out.println("enter your second string");
	String s2=scan.nextLine();
	String ms=s1.concat(s2);
	System.out.println("merged String is : "+ms);
	
}
}
