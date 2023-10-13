import java.util.*;
 class div5{
 public static void main(String[] args){
  
  System.out.println("enter the number: ");
  Scanner obj=new Scanner(System.in);
  int num=obj.nextInt();
  if (num%5==0){
  System.out.println("number is divisible by 5");
  }
  else
  {System.out.println("number is not divisible by 5");}
}
}
