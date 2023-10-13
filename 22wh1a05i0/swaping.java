import java.util.*;
class swaping
{
public static void main(String args[])
{
System.out.println("find largest number: ");
Scanner input=new Scanner(System.in);
System.out.println("Enter 1st number: ");
int num1 = input.nextInt();
System.out.println("Enter 2nd number: ");
int num2 = input.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("the number after swaping: " +num1);
System.out.println("the number after swaping: " +num2);
input.close();
}
}
