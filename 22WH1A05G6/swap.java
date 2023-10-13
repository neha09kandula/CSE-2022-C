import java.util.*;
class swap
{
public static void main(String[] args)
{
	int temp;
	System.out.println("enter the numbers");
	Scanner input = new Scanner(System.in);
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	temp = n1;
	n1 = n2;
	n2 = temp;
	System.out.println("n1:" + n1 + " " + "n2:" + n2);
}
}