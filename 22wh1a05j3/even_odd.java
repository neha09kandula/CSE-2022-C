import java.util.*;
public class even_odd
{
public static void main(String args[])
{
System.out.println("enter a number");
Scanner input=new Scanner(System.in);
int b=input.nextInt();
if (b%2==0)
{
System.out.println("Given number is even");
}
else
{ 
System.out.println("Given number is odd");
}
}
}