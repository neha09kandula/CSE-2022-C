import java.util.*;
public class factorial
{
public static void main(String args[])
{
int i,f=1;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int n=input.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("FACTORIAL VALUE IS:"+f);
input.close();
}
}