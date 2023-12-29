import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.print("enter number: ");
int num = input.nextInt();
int fact = 1;
int i;
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("the factorial of " +num+ " is " +fact );
input.close();
}
}