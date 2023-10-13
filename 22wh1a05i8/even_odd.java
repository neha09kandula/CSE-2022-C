import java.util.*;
public class even_odd
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int n=input.nextInt();
if (n%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
input.close();
}
}