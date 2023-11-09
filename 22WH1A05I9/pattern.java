import java.util.*;
public class pattern
{
public static void main(String args[])
{
int i,j;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number");
int n=input.nextInt();
for(i=0;i<=n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println("");
}
input.close();
}
}
