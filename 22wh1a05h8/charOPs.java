package javaprograms;
import java.util.*;


public class charOPs {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		StringTokenizer st = new StringTokenizer("my name is hello"," ");
		
		String name = "javapoint";
		char ch = name.charAt(4);
		System.out.println(ch);
		
		String name2 = "java strings";
		char[] dst = new char [6];
		name2.getChars(4, 9, dst, 0);
		System.out.println(dst);
		
		String mystr = "Hello";
		String myst = "World";
		char result = mystr.charAt(0);
		char result1 = myst.charAt(2);
		System.out.println(result);
		System.out.println(result1);
		
	}

}
