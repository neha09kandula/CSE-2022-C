import java.util.*;
public class swaping
{
public static void main(String args[])
{
int a,b,c;
Scanner input=new Scanner(System.in);
System.out.println("enter two number");
a=input.nextInt();
b=input.nextInt();
c=a;
a=b;
b=c;
System.out.println("first number is:"+a);
System.out.println("second number is:"+b);
input.close();
}
}

