import java.util.*;
public class swapWithoutVariable
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the value of a : ");
int a = input.nextInt();
System.out.println("Enter the value of b: ");
int b =  input.nextInt();
a = a + b;
b = a - b;
a = a - b;
System.out.println("The value of a after swapping is " +a);
System.out.println("The value of  b after swapping is " +b);

input.close();
}
}