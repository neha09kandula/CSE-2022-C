package programs;
import java.util.*;
public class Exception {
	public void numberformatcheck(int a)
	{
		if(a%2==0)
			System.out.print("The number is even");
		else
			throw new ArithmeticException("The number is odd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=in.nextInt();
		Exception obj=new Exception();
		obj.numberformatcheck(num);
		in.close();
	}

}
