import java.util.*;
public class pattern
{
public static void main(String args[])
{
System.out.println("enter the range");
Scanner input=new Scanner(System.in);
int x=input.nextInt();
for(int i=0;i<x;i++) 
for(int j=0;j<=i;j++)
{
System.out.println("*");
System.out.println("");
}}}