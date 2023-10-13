import java.util.*;
class swaping
{
public void swap(int num1,int num2)
{
int x;
x=num1;
num1=num2;
num2=x;
System.out.println(num1);
System.out.println(num2);
}
public static void main(String[]args)
{
Scanner input =new Scanner(System.in);
System.out.println("enter the two numbers o be swaped");
System.out.println("enter the first number");
int num1=input.nextInt();
System.out.println("enter the econd number");
int num2=input.nextInt();
input.close();
swaping S = new swaping();
S.swap(num1,num2);
}
}

