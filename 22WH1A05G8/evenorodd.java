import java.util.*;
class evenorodd
{
	public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	int num=input.nextInt();
	if(num%2==0)
	{
		System.out.println("Number is "+num+" Even");
	}
	else
	{
		System.out.println("Number is "+num+" odd");
	}
	input.close();
}
}