//if a num is even or odd
import java.util.Scanner;

public class even_odd
{
  int a;
 public int even_odd()
  {
    if (a % 2==0)
    {
      System.out.println("The num is even");
    }
    else
    System.out.println("The num is odd");
  }
 public static void main(String args[])
 {
  even_odd num=new even_odd();
  System.out.println("enter a num");
  Scanner input=new Scanner(System.in);
  int a=input.nextInt();
  System.out.println(num.a);
  }
}
