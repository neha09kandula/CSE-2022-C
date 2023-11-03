package Java22wh1a05d0;
import java.lang.*;
import java.util.*;

public class methods {
 public static void main(String args[]) {
	StringBuffer sb=new StringBuffer();
	StringTokenizer st=new StringTokenizer("My name is Smriti"," ");
	
		String name="javatpoint";
		char ch=name.charAt(4);
		System.out.println(ch);
		
		String name1="java Strings";
		char[] dst = new char[6];
		name.getChars(4, 9, dst, 0);
		System.out.println(dst);
		
		String myStr = "Hello";
		String mySt = "World";
		char result = myStr.charAt(0);
		char result1 = mySt.charAt(2);
		System.out.println(result);
		System.out.println(result1);
 }
}
