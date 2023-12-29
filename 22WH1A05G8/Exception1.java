package programs;
import java.util.*;

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
	finally
	{
		System.out.println("Program completed");
	}
	}
}
