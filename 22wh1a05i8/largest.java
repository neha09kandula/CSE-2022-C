import java.util.*;
public class largest
{
public static void main(String args[])
{
int a,b,c;
Scanner input=new Scanner(System.in);
System.out.println("enter three  number");
a=input.nextInt();
b=input.nextInt();
c=input.nextInt();
if(a>b && a>c)
{
System.out.println("largest number is :"+a);
}
else if(b>c && b>a)
{
System.out.println("largest number is:"+b);
}
else
{
System.out.println("largest number is :"+c);
}
input.close();
}
}