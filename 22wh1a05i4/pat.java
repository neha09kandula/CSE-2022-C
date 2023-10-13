import java.util.Scanner;
public class pat{
  public static void main(String args[])
     {
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter a range:");
        int num=reader.nextInt();
        for(int i=0; i < num; i++)
         {
           for(int j=0; j <=i; j++)
            {
               System.out.println("*"); 
             }
                   System.out.println("");
          }   
      }
 }