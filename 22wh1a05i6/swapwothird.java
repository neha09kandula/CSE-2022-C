import java.util.*;
class swapwothird
{
public static void main(String args[])
{
int temp;
Scanner input = new Scanner(System.in);
System.out.println("Enter the a value");
int a = input.nextInt();
System.out.println("Enter the b value");
int b = input.nextInt();
a = a+b;
b = a-b;
a = a-b;
System.out.println("the value of a after swapping is:" +a);
System.out.println("the value of b after swapping is:" +b);

input.close();
}
}