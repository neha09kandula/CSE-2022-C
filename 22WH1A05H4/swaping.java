import java.util.*;
class Swap {
public static void main(String args[])
{
int temp;
Scanner input=new Scanner (System.in);
System.out.println("enter the number for A :");
int A=input.nextInt();
System.out.println("enter the number for  :");
int B=input.nextInt();
System.out.println("The values of A,B before swapping"+A +B);
{
temp=A;
A=B;
B=temp;
System.out.println("The values of A,B after swapping " +A  +B);
}

input.close();
}
}
