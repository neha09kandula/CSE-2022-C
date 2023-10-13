import java.util.*;
public class largest{
  public static void main(String args[]){
    System.out.println("enter the numbers");
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    Scanner s3 = new Scanner(System.in);
    int num1 = s1.nextInt();
    int num2 = s2.nextInt();
    int num3 = s3.nextInt();
    if(num1 >= num2 && num1 >=num3){
            System.out.print(num1+ " is larget");
   } else if(num2 >= num3 && num2 >=num1){
    System.out.print(num2+ " is larget");
}
  else{
     System.out.print(num3+ " is larget");
}
  }
}