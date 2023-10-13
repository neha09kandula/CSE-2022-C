import java.util.*;
class divisible
{
	public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	int num=input.nextInt();
	if(num%5==0)
	{
		System.out.println("Number is Divisible by 5");
	}
	else
	{
		System.out.println("number is not divisible by 5");
	}
	input.close();
}
}