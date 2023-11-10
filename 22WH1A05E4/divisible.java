import java.util.Scanner;
public class divisible
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number:");
int num=input.nextInt();
if(num%5==0)
{
  System.out.println("The number is divisible");
}
else
   System.out.println("The number is not  divisible");
}
}