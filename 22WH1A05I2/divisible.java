//divisible by 5
import java.util.Scanner;
public class divisible
{
 public static void main(String args[])
{
  System.out.println("enter a num to check divisibility");
  Scanner input=new Scanner(System.in);
  int a=input.nextInt();
  if (a%5 ==0 )
  {
  System.out.println("The " + a   + "is divisible by 5" );
  }
  else
  {
  System.out.println("It is not divisible by 5");
  }

}
}
