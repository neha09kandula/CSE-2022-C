import java.util.*;
class swap2
{
	public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int num1=input.nextInt();
	System.out.println("Enter the value of b:");
	int num2=input.nextInt();
	num1=num1-num2;
	num2=num1+num2;
	num1=num2-num1;
	System.out.print("a="+num1+" b="+num2);
	input.close();
}
}