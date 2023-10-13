import java.util.*;
public class factorial
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number : ");
int num = input.nextInt();
int product = 1;
int i;
for(i=1;i<=num;i++)
{
product *= i;
}
System.out.println("The factorial of " +num+ " is " +product);

input.close();
}
}
 
