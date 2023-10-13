package mypackage;
import java.util.*;
import java.lang.*;
public class String2 {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		StringTokenizer st= new StringTokenizer("my name is swathi","");
		System.out.println(st);
		
		String name ="javapoint";
		char ch=name.charAt(4);
		System.out.println(ch);
		
		String name1= "amanya sharma";
		char[] dst = new char[6];
		name1.getChars(4, 9, dst, 0);
		System.out.println(dst);
		
		String myStr2= "Hello";
		String myStr3 = "World";
		char result = myStr2.charAt(0);
		char result1 = myStr3.charAt(2);
		System.out.println(result);
		System.out.println(result1);
	}
	}


