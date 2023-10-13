import java.util.*;
class main{
public static void main(String args[])
{
   int temp;
   int num1;
   int num2;
   Scanner input = new Scanner(System.in);
System.out.println("Enter the value for SWAP:");
int n1 = input.nextInt();
int n2 = input.nextInt();
System.out.println("Values before swap:"+"num1="+n1+"\nnum2="+n2);
temp = n1;
n1=n2;
n2=temp;
System.out.println("Values after swap:"+"num1="+n1+"\nnum2="+n2);
input.close();
}
}
