import java.util.Scanner;
public class Largest{
public static void main(String[] args){
	int a,b,c;
	Scanner input1=new Scanner(System.in);
	System.out.println("enter the first number:");
	a=input1.nextInt();
	System.out.println("enter the second number:");
	b=input1.nextInt();       
	System.out.println("enter the three number:");
	c=input1.nextInt();
	if(a>=b && a>=c){
	System.out.println("a is greate");
	}
	else if(b>=a && b>=c){
	System.out.println("b is greater");
	}
	else{
	System.out.println("c is greater");
	}
}
}
	