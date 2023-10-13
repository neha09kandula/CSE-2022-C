import java.util.*;
class divisible
{
 	public static void main(String args[])
{
	System.out.println("enter the number: ");
        Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	input.close();
	if(num % 5 == 0)
	{
	System.out.println("It is divisible");
	}
	else
{
System.out.println("It is not divisible");
}
}
}







