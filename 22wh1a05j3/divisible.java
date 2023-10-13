import java.util.*;
public class divisible
{
public static void main(String arg[])
{
System.out.println("enter a number");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
if (a%5==0)
{
System.out.println("given number is divisible by 5");
}
else
{
System.out.println("given number is not divisible by 5");
}
}
}
