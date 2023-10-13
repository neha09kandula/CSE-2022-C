import java.util.Scanner;

public class print
{
 public static void main(String args[])
 {
  System.out.println("enter a num for a pattern");
  Scanner input=new Scanner(System.in);
  int num=input.nextInt();
  int i,j=0;
  for(i=1;i<=num;i++)
  {
   for(j=i;j<=num-1;j++)
    {
     System.out.println("*");
    }
   }
 }
}