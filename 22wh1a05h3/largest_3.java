import java.util.*;
class largest
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("enter the three numbers to find the largest of 3");
System.out.println("enter the first number");
int num1 = input.nextInt();
System.out.println("enter the second number");
int num2 = input.nextInt();
System.out.println("enter the third number");
int num3 = input.nextInt();
input.close();
if(num1>num2 && num2>num3)
{
System.out.printf("the largest number is %d",num1).println();
}
else if(num2>num3)
{
System.out.printf("thelargest number is %d",num2).println();
}
else{
System.out.printf("the largest number is %d",num3).println();
}
}
}