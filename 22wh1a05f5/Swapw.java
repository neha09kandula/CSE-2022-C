import java.util.Scanner;
public class Swapw{
	public static void main(String[] args){
	int x,y;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the first number");
	x=input.nextInt();
	System.out.println("enter the second numbmer");
	y=input.nextInt();
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("the values of x is "+x);
	System.out.println("teh values of y is "+y);
}
}