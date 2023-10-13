import java.util.*;
public class largest
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner input=new Scanner(System.in);
int x=input.nextInt();
int y=input.nextInt();
int z=input.nextInt(); 
{
if(x>y){
          if(x>z)
           {
           System.out.println("x is largest");
           }
          else
           {
           System.out.println("zis largest");
           }
     }
else
      {
       if(y>z)
        {
        System.out.println("y is largest");
        }
        else
        {
        System.out.println("z is largest");
       }
      }
   }
}}