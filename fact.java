import java.util.*;
class factorial
{
public static void main(String args[])
{
	System.out.println("enter a number");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	int i;
	int fact=1;

	for(i=num;i>0;i--)
{
	fact = fact*i;
	
}
System.out.println("the factorial is "+fact);
}
}