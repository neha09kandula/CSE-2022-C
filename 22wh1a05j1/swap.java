import java.util.*;
public class swap
{
public static void main(String args[])
{
System.out.println("swap the numbers");
Scanner input=new Scanner(System.in);
System.out.println("eneter a");
int a=input.nextInt();
Scanner inpu=new Scanner(System.in);
System.out.println("enter b");
int b=input.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("a is");
System.out.println(a);
System.out.println("b is");
System.out.println(b);
input.close();
}
}