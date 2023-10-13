import java.util.*;
public class divisible_5
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number");
int n=input.nextInt();
if (n%5==0)
{
System.out.println("It is Divisible by 5");
}
else
{
System.out.println("It is NOT Divisible by 5");
input.close();
}
}
}