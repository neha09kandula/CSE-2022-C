import java.util.Scanner;
class evenorodd
{
public static void main(String args[])
{
System.out.println("To check wheather the num is even or odd");
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number: ");
int num = input.nextInt();
if(num%2==0)
System.out.println("Num is even");
else
System.out.println("Num is odd");
input.close();
}
}