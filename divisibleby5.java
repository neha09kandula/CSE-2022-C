import java.util.Scanner;
class divisibleby5
{
public static void main(String args[])
{
System.out.println("To check wheather the num is divisible by 5");
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number: ");
int num = input.nextInt();
if(num%5==0)
System.out.println("Num is divisible");
else
System.out.println("Num is not divisible");
input.close();
}
}