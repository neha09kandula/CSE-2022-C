import java.util.*;
class factorial
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("enter the number to find factorial");
int num = input.nextInt();
input.close();
int fact=1;
for(int i=num;i>=1;i--)
{
fact=fact*i;
}
System.out.printf("the factorial of given number is %d",fact).println();
}
}