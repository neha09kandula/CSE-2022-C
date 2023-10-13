package csec2022;
import java.util.*;


public class Calci {
	public static void main(String[]args) {
		int x,y;
		char op;
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the value of x: ");
		x=input.nextInt();
		System.out.println("enter the value of y:");
		y=input.nextInt();
		System.out.println("select the choice \n");
		System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.division\n 0.exit  ");
		op=input.next().charAt(0);
		
		switch(op) {
		case '1':
		System.out.println("the sum is "+ (x+y));
		break;
		case '2':
			System.out.println("the difference is"+ (x-y));
			break;
		case '3':
			System.out.println("the product is"+(x*y));
			break;
		case '4':
			System.out.println("the reminder is"+(x%y));
			break;
		case '0':
			System.out.println("invalid choice");
		}
		
		
		}	
		

	
}
