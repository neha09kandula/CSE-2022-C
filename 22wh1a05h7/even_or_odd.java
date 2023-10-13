import java.util.*;
class divisibility_check
{
public static void main(String args[])
{
 Scanner input=new Scanner(System.in);
 System.out.println("Enter a number:");
 int number=input.nextInt();
 if (number%2==0){
 System.out.println("your number  is an even number");
 }
 else
 {
 System.out.println("number is a odd number" );
 }
 input.close();
}
}