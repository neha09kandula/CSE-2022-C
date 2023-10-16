import java.util.*;
class Large {
public static void main(String args[])
{
Scanner input=new Scanner (System.in);
System.out.println("enter the number for A :");
int A=input.nextInt();
System.out.println("enter the number for B :");
int B=input.nextInt();
System.out.println("enter the number for C :");
int C=input.nextInt();
if(A>B && A>C) {
System.out.println("A is largest number");
 }
else if(B>A && B>C) {
 System.out.println("B is largest number");
}
else {
 System.out.println("C is largest number");
}
input.close();
}
}
