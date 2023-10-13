import java.util.*;
public class swapWithVariable
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the 1st number : ");
int num1 = input.nextInt();
System.out.println("Enter the 2nd number: ");
int num2 =  input.nextInt();
int temp = 0;
temp = num1;
num1 = num2;
num2 = temp;
System.out.println("The value of num1 is " +num1);
System.out.println("The value of num2 is " +num2);
input.close();
}
}
 

