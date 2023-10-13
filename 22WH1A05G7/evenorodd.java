import java.util.*;
class evenorodd
{
public static void main(String[] args)
{
	System.out.println("enter the number");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	if(num%2==0)
	{
		System.out.println(num + " " + "is even number");
	}
	else
	{
		System.out.println(num + " " + "is odd number");
	}
	input.close();
}
}
	