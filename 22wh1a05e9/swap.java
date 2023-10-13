import java.util.*;
class main{
public static void main(String args[])
{ int temp;
  int num1;
int num2;
 Scanner input = new Scanner(System.in);
System.out.println("Enter the values to swap:");
int n1 = input.nextInt();
int n2 = input.nextInt();
System.out.println("Values before swapping:"+"num1="+n1+"\nnum2="+n2);
temp = n1;
n1=n2;
n2=temp;
System.out.println("Values after swapping:"+"num1="+n1+"\nnum2="+n2);
input.close();
}
}