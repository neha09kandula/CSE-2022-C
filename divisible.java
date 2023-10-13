
import java.util.*;
public class divisible
{
public static void main(String args[])
{
	System.out.println(" enter the number");
	Scanner input= new Scanner(System.in);
	int number=input.nextInt();
	if(number%5==0)
	{
		System.out.println("it is divisible by 5");
	
	}
	else
	{
		System.out.println("it is not divisible by 5");
	}
}
}