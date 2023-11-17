package javapractice;
import java.util.*;

public class assign2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter first number:");
		double first=input.nextDouble();
		System.out.println("enter second number:");
		double second=input.nextDouble();
		System.out.println("enter target operation(+,-,*,%,/):");
		String op=input.next();
		double result=0;
		switch(op) {
		case "+":
			result=first+second;
			break;
		case "-":
			result=first-second;
			break;
		case "*":
			result=first*second;
			break;
		case "/":
			if (second!=0)
			{
		    result=first/second;
			}
			else
			{
				System.out.println("divison by zero is not possible");
			}
			break;
			default:
				System.out.println("invalid output");
		}
		System.out.println("the result is :"+result);
		input.close();

	}

}