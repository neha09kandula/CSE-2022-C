import java.util.*;
public class templess
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter value a :");
int a=input.nextInt();
System.out.println("enter value b :");
int b=input.nextInt();
System.out.println(a+ "is the value of a before swapping");
System.out.println(b+ "is the value of b before swapping");
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+ "is the value of a after swapping");
System.out.println(b+ "is the value of b after swapping");
}
}