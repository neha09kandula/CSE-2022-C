import java.util.*;
class swap
{
public static void main(String args[])
{
int temp;
Scanner input = new Scanner(System.in);
System.out.println("Enter the a value");
int a = input.nextInt();
System.out.println("Enter the b value");
int b = input.nextInt();
temp = a;
a=b;
b = temp;
System.out.println("the value of a after swapping is:" +a);
System.out.println("the value of b after swapping is:" +b);

input.close();
}
}