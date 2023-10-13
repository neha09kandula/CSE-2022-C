import java.util.*;
class even_odd
{
public static void main(String args[])
{

Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int a=input.nextInt();
if (a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
input.close();
}
}