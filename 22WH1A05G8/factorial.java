import java.util.*;
class factorial
{
	public static void main(String args[])
{
	int i,fact=1;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value:");
	int num=input.nextInt();
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.print(fact);	
	input.close();
}
}