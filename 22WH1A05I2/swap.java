import java.util.Scanner;
public class swap
{

public static void main(String args[])
{

  System.out.println("enter 1st num");
  Scanner num1=new Scanner(System.in);
  int a=num1.nextInt();

  System.out.println("enter 2nd num");
  Scanner num2=new Scanner(System.in);
  int b=num2.nextInt();
   a=b;
 a=a;
b=a;
 
System.out.println("After swapping a = " + a + "After swapping b = "+ b);

}
}