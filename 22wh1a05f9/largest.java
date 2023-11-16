import java.util.*;
public class largest
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter first number");
int a=input.nextInt();
System.out.println("enter second number");
int b=input.nextInt();
System.out.println("enter third number");
int c=input.nextInt();

if(a>c && a>b)
{
System.out.println(" the largest number is"+a);
}
else if(b>c)
{
System.out.println(" the largest number is"+b);
}
else
{
System.out.println("the largest number is "+c);
}
input.close();
}
}