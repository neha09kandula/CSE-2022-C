import java.util.*;
class high{
    public static void main(String args[])
    {
        System.out.println("Number is greater:");
	Scanner input=new Scanner(System.in);
	System.out.println("enter the first number:");
	int num1=input.nextInt();
	System.out.println("enter the second number:");
	int num2=input.nextInt();
	System.out.println("enter the third number:");
	int num3=input.nextInt();
	
	if(num1>=num2 && num1>=num3)
		System.out.println(num1+ "is the largest number");	
	else if(num2>=num1 && num2>=num3)
		System.out.println(num2+ "is the largest number");
	else
		System.out.println(num3+ "is the largest number");
     }
}