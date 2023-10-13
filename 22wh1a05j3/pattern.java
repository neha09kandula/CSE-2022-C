import java.util.*;
public class pattern
{
public static void main(String args[])
{
System.out.println("enter a range");
Scanner input=new Scanner(System.in);
int c=input.nextInt();
for (int i=0;i<c;i++)
{
for (int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}