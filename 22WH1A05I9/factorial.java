import java.util.*;
public class factorial
{
public static void main(String args[])
{
int i,f=1;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number");
int n=input.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("The Factorial of "+n+" is: "+f);
input.close();
}
}
