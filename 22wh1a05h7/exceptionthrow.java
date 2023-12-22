package csec_labinternal1;
import java.util.*;
public class exceptionthrow {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		a=in.nextInt();
		if(a>10)
		{
			throw new ArithmeticException("Number has exceeded the limit");
		}
		else
			System.out.println("Your number is valid");
		in.close();
	}

}
