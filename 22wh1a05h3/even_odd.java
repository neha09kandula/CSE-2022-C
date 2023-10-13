import java.util.*;
class divisible
{
public static void main(String[]args)
{
System.out.println("enter the number you want to check it is divisible by 5 or not");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
input.close();
if(num % 5==0)
{
System.out.println("it is divisible");
}
else
{
System.out.println("it is not divisible");
}
}
}