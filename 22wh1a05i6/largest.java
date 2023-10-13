import java.util.*;
class largest
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int a = input.nextInt();
System.out.println("Enter the number");
int b  = input.nextInt();
System.out.println("Enter the number");
int c = input.nextInt();
if (a>b && a>c){
System.out.println(" a is largest of three numbers");
}
else if(b>a && b>c)
{
System.out.println(" b is the largest of three numbers");
}
else
{
System.out.println("c is the largest of three nubers");
}
input.close();
}
}