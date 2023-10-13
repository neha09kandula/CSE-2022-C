import java.util.*;
class swap{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	System.out.println("enter a number");
	int b=sc.nextInt();
	int temp;
	System.out.println("a is " + a);
	System.out.println("b is " + b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("a is " + a);
	System.out.println("b is " + b);
}
}