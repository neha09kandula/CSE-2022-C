import java.util.*;
class largest
{
public static void main(String args[])
{
System.out.println("find largest number: ");
Scanner input=new Scanner(System.in);
System.out.println("Enter 1st number: ");
int num1 = input.nextInt();
System.out.println("Enter 2nd number: ");
int num2 = input.nextInt();
System.out.println("Enter 3rd number: ");
int num3 = input.nextInt();
if(num1>num2 && num1>num3)
System.out.println(num1+ " is largest");
else if(num2>num1 && num2>num3)
System.out.println(num2+" is largest");
else
System.out.println(num3+" is largest");
input.close();
}
}
