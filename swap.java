import java.util.*;
class swap
{
public static void main(String args[])
{
	System.out.println("enter a");
	System.out.println("enter b");
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int temp=0;
	while(temp==0)
{
	temp=a;
	a=b;
	b=temp;
	break;
}
	System.out.println(a);
	System.out.println(b);
}
}