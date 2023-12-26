package javaprograms;
import java.util.*;
public class Exception  {
	public void check(int a)
	{
		if(a%2==0)
			System.out.print("It is even number");
		else
			throw new ArithmeticException("It is odd number");
	}
	public static void main(String[] args) {
	        Scanner in=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=in.nextInt();
		Exception obj=new Exception();
		obj.check(num);
		in.close();
	}

}