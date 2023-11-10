import java.util.*;
public class fact
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int a=input.nextInt();
 int fact=1;
int i;
for(i=a;i>=1;i--)
{
fact=fact*i;
}
System.out.println(fact);

input.close();
}
}