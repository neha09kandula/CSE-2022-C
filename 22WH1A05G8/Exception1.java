package internal;
import java.util.*;
import java.io.*;

public class Exception1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=a/b;
		System.out.println(result);
	}
	catch(ArithmeticException ae) {
		System.out.println(ae);
	}
	}
}
