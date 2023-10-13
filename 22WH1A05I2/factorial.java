import java.util.Scanner;

public class factorial{

public static void main(String args[])
{
   System.out.println("enter a num for factorial");
   Scanner num1=new Scanner(System.in);
   int a=num1.nextInt();
   int fact=1,i;

  if(a==1)
  {
  System.out.println("factorial of given num is 1");
  }
  else
  {
   for(i=1;i<=a;i++)
    {
    fact = fact *(i);
 }
    System.out.println("Factorial is " + fact);
  }
}
}