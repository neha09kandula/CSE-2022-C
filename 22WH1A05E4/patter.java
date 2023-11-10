import java.util.Scanner;
public class pattern
{
public static void main(String args[])
{
  int s;
  int i,j;
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a number:");
  s=input.nextInt();
 
  for(i=0; i<s; i++)
{
  for(j=0; j<=1; j++)
{
System.out.println("* ");
}
System.out.println();
}
}
}

