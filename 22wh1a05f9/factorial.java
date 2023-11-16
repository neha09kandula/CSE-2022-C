import java.util.*;
public class factorial
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
int number=input.nextInt();
int i;
int fact=1;
for(i=1;i<number;i--)
{
fact=fact*i;
}
System.out.println("factorial value is"+fact);
input.close();
}
}