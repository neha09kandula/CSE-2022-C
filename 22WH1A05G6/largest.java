import java.util.*;
class largest
{
public static void main(String[] args)
{
	System.out.println("enter the number");
	Scanner input = new Scanner(System.in);
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	int n3 = input.nextInt();
	if(n1>n2 && n1>n3)
	{
		System.out.println(n1 + " " + "is largest");
	}
	else if(n2>n3)
	{
		System.out.println(n2 + " " + "is largest");
	}
	else
	{
		System.out.println(n3 + " " + "is largest");
	}
	input.close();
}
}
