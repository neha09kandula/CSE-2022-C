import java.util.*;
class swap 
{
public static void main(String[] args) 
{
System.out.print("enter number");
Scanner reader = new Scanner(System.in);
System.out.print("Enter 1st: ");
int num1 = reader.nextInt();
System.out.print("Enter 2nd: ");
int num2 = reader.nextInt();
int temp=0;
temp=num1;
num1=num2;
num2=temp;
System.out.print("Enter after swapping:" +num1);
System.out.print("Enter number after swaping:" +num2);

}
}