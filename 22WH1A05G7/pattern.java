import java.util.*;
class pattern
{
public static void main(String[] args)
{
	int i,j;
	System.out.println("enter the number");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	for(i=0;i<=num;i++)
	{
		System.out.println(" ");
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	}
	input.close();
}
}
