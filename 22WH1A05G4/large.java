import java.util.*;
public class large
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int a=input.nextInt();
Scanner inp=new Scanner(System.in);
int b=input.nextInt();
Scanner in=new Scanner(System.in);
int c=input.nextInt();
if (a>b&&a>c)
{
System.out.println("a is greater");
}
else if (a<c&&b<c)
{
System.out.println("c is greater");
}
else
{
System.out.println("b is greater");
}
input.close();
}
}
