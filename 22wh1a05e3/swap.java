import java.util.Scanner;
public class swap{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=input.nextInt();
System.out.println("Enter the value of b: ");
int b=input.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println("After Swapping:a= " +a+ ",b= " +b);}
}
