import java.util.*;
public class large{
 public static void main(String[] args){
 System.out.println("enter the number");
  Scanner s1 = new Scanner(System.in);
  Scanner s2 = new Scanner(System.in);
  Scanner s3 = new Scanner(System.in);
  int num1 = s1.nextInt();
  int num2 = s2.nextInt();
  int num3 = s3.nextInt();
  if(num1 >= num2 && num1 >= num3){
   System.out.println("num1 is larger");
  }
  else if(num2 >= num1 && num2 >= num3){
   System.out.println("num2 is larger");
  }
  else {
   System.out.println("num3 is larger");
  }
 }
}