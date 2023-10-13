import java.util.*;
class factorial
{
public static void main(String[] args)
{
	int factorial=1;
	int i;
	System.out.println("enter the number");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	for(i=1;i<=num;i++)
	{
		factorial = factorial * i;
	}
	System.out.println("factorial of" + " " + num + " " + "is" + " " + factorial);
	input.close();
}
}