import java.util.*;
class pattern
{
	public static void main(String args[])
{
	int i,j;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	int num=input.nextInt();
	for(i=0;i<=num;i++)
	{
		System.out.println(" ");
		for(j=0;j<i;j++)
		{
			System.out.print("* ");
		}
	}
	input.close();
}
}