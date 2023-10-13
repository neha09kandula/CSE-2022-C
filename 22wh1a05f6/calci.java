package csec2022;
import java.util.*;
public class calci {
 public static void main(String[]args) {
	 double a,b,c;
	 char operator;
	 System.out.println("enter a");
	 Scanner input1=new Scanner(System.in);
	 a=input1.nextDouble();
	 System.out.println("enter b");
	 Scanner input2=new Scanner(System.in);
	 b=input2.nextDouble();
	System.out.println("select the operator:+,-,*,/");
	Scanner input3=new Scanner(System.in);
	 operator=input3.next().charAt(0);
	 switch(operator) {
	 case '+':
		 c=a+b;
		 System.out.println("Addition of a,b is:\n"+c);
		 break;
	 case '-':
		 c=a-b;
		 System.out.println("Subtraction of a,b is;\n"+c);
		 break;
	 case '*':
		 c=a*b;
		 System.out.println("Multiplcation of a,b is:\n"+c);
		 break;
	 case '/':
		 c=a/b;
		 System.out.println("Division of a,b is :\n"+c);
		 break;
	 default:
	        System.out.println("Invalid operator!");
	        break;	 
	 
	 }
 }
}
