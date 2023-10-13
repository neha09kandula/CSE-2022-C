import java.util.Scanner;
public class Swap{
public static void main(String[] args){
	int a,b,temp=0;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the first number");
	a=input.nextInt();
	System.out.println("enter the second number;");
	b=input.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println(a);
	System.out.println(b);
}
}
	