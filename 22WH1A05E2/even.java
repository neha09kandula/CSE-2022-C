import java.util.*;
class numbers{
    public static void main(String args[])
    {
        System.out.println("Number is even or odd:");
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=input.nextInt();

	if (num % 2==0)
		System.out.println("Number is even");
	else
		System.out.println("Number is odd");
     }
}