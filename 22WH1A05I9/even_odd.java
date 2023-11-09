import java.util.*;
public class even_odd
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number");
int n=input.nextInt();
if (n%2==0)
{
System.out.println("Number is EVEN");
}
else
{
System.out.println("Number is ODD");
}
input.close();
}
}
