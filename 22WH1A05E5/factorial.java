import java.util.Scanner;
public class factorial
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int fac=input.nextInt();
int i=1,fact=1;
while(i<=fac)
{
fact = fact*i;
i++;
}
System.out.println("Factorial of the number is :"+fact);
}
}