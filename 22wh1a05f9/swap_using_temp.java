import java.util.*;
public class swap_using_temp
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter a value");
int a=input.nextInt();
System.out.println("enter b value");
int b=input.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("after swapping");
System.out.println("a="+a);
System.out.println("b="+b);
input.close();
}
}