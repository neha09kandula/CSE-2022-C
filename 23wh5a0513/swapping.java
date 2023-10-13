import java.util.*;
public class swapping
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner input=new Scanner(System.in);
int x=input.nextInt();
int y=input.nextInt();
{
System.out.println("before swapping;x="+x+"y="+y);
}
x=x+y;
y=x-y;
x=x-y;
{
System.out.println("after swapping:x="+x+"y="+y);
}
}}