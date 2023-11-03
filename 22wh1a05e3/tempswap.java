import java.util.Scanner;
public class tempswap{
public static void main(String[] args)
{
int temp=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter the value of a: ");
a=input.nextInt();
System.out.println("Enter the value of b: ");
b=input.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("a= "+a,"b= "+b);}
}
