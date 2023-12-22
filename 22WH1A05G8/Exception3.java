package internal;
import java.util.*;
public class Exception3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you are an adult");
		}
		else
		{
			throw new ArithmeticException("Noteligible");
		}
	}
}
