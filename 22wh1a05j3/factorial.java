import java.util.*;
public class factorial
{
public static void main(String args[])
{
System.out.println("enter a number");
Scanner input=new Scanner(System.in);
int fact=1;
int x=input.nextInt();
for(int i=x;i>=1;i--)
{

fact=fact*i;
}
System.out.println("the factorial is="+fact);
}
}