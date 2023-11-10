import java.util.*;
public class greater
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter value a :");
int a=input.nextInt();
System.out.println("enter value b :");
int b=input.nextInt();
System.out.println("enter value c :");
int c=input.nextInt();
if(a>b && a>c)
{
System.out.println(a+"is the greater number");
}
else if(b>c)
{
System.out.println(b+"is the greater number");
}
else
System.out.println(c+"is the greater number");
}
}