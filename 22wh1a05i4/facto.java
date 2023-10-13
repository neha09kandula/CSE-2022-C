import java.util.Scanner;
public class facto{
  public static void main(String args[])
     {
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        int i=1,fact=1;
        while(i<=num)
         {
              fact=fact*i;
               i++;
         }
         System.out.println("factorial of the number: " + fact);
      }
}