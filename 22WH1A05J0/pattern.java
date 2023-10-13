import java.util.*;
public class pattern
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
int number=input.nextInt();
int i;
int j;
for(j=1;j<number;j++)
{
for(i=1;i<j;i=i+1)
{
System.out.print("*");
}
System.out.println("");
}
input.close();
}
}