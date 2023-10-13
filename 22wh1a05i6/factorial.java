import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int number = input.nextInt();
long factorial = 1;
for(int i = 1; i<=number; i++)
{
factorial*=i;
}
System.out.println("factorial of "+number+" is:" +factorial);
input.close();
}
}