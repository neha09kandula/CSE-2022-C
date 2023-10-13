import java.util.Scanner;
public class divisibleBy5
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number: ");
int num = input.nextInt();
if(num%5==0)
{
System.out.println("The number is divisble by 5");
}
else
{
System.out.println("The number is not divisble by 5");
}
input.close();
}
}

