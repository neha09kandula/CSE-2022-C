import java.util.*;
class main{
public static void main(String args[])
{
  int fact =1;
  int i;
  Scanner input=new Scanner(System.in);
 System.out.println("enter the value to find factorial");
 int num = input.nextInt();
 for(i=num;i>0;i--){
 fact=fact*i;
 }
 System.out.print("the factorial of given number is:"+fact);
 input.close();
}
}