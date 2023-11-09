import java.util.*;
public class largest
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the first Number");
int a=input.nextInt();
System.out.println("Enter the second Number");
int b=input.nextInt();
System.out.println("Enter the third Number");
int c=input.nextInt();
if (a>b && a>c)
{
System.out.println("The largest number is:"+a);
}
else if(b>a && b>c)
{
System.out.println("The largest number is:"+b);
}
else
{
System.out.println("The largest number is:"+c);
}
input.close();
}
}