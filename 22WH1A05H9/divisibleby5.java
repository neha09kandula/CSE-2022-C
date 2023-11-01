import java.util.Scanner;
class divisibleby5
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number");

int num=input.nextInt();
if(num%5==0)
System.out.print("num is divisible by 5");
else
System.out.print("num is not divisible by 5");
input.close();
}
}