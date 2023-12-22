/**
 * 
 */
package internal;
import java.lang.*;
import java.util.*;
public class stringmerge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first string");
  String s1=sc.nextLine();
  System.out.println("enter your second string");
  String s2=sc.nextLine();
  String merge=s1.concat(s2);
  System.out.println("merged new string is: "+merge);
	}

}
