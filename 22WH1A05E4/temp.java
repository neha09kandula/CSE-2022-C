import java.util.*;
public class temp
{
public static void main(String args[])
{
int a,b,temp;
Scanner input=new Scanner(System.in);
System.out.println("enter value a :");
 a=input.nextInt();
System.out.println("enter value b :");
 b=input.nextInt();
temp=a;
a=b;
b=temp;
System.out.println(a+ "is the value!");
System.out.println(b+ "is the value!");
}
}
