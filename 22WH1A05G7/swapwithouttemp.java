import java.util.*;
class swapwithouttemp
{
public static void main(String[] args)
{
	System.out.println("enter the numbers");
	Scanner input = new Scanner(System.in);
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	n1 = n1 - n2;
	n2 = n1 + n2;
	n1 = n2 - n1;
	System.out.println("n1:" + n1 + " " + "n2:" + n2);
}
}
