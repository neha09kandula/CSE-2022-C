import java.util.*;
class largest
{
	public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the 3 value:");
	int num1=input.nextInt();
	int num2=input.nextInt();
	int num3=input.nextInt();
	if(num1 > num2 && num1 > num3)
	{
		System.out.print(num1+" is grater");
	}
	else if(num2 > num3)
	{
		System.out.print(num2+" is grater");
	}
	else
	{
		System.out.print(num3+" is grater");
	}
	input.close();
}
}