import java.util.*;
class divisible
{
public static void main(String[]args)
{
System.out.println("enter the number you want to check it is even or odd");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
input.close();
if(num % 2==0)
{
System.out.println("it is even");
}
else
{
System.out.println("it is odd");
}
}
}