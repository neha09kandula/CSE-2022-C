import java.util.*;
public class swapping
{
public static void main(String args[])
{
System.out.println("enter a value");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
System.out.println("enter b value");
int b=input.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping \n a value is"+a+", b value is "+b);
}
}
