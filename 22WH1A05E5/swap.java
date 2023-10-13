import java.util.Scanner;
public class swap {
public static void main(String args[])
{
	int a,b,temp;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	a=input.nextInt();
	System.out.println("Enter the value of b: ");
	b=input.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+" is the value!");
	System.out.println(b+" is the value!");
}	
}