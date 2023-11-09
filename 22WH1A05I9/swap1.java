import java.util.*;
public class swap1
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the first Number");
int a=input.nextInt();
System.out.println("Enter the second Number");
int b=input.nextInt();
int c;
c=a;
a=b;
b=c;
System.out.println("The first number after swapping:"+a);
System.out.println("The second number after swapping:"+b);
input.close();
}
}
