import java.util.*;
class swap
{
	public static void main(String args[])
{
	int temp;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int num1=input.nextInt();
	System.out.println("Enter the value of b:");
	int num2=input.nextInt();
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.print("a="+num1+" b="+num2);
	input.close();
}
}