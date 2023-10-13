import java.util.*;
public class divisible{
  public static void main(String args[]){
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%5 == 0){
     System.out.println(num+" is divisible by 5.");
}else{
    System.out.print(num+" is not divisible by 5.");
  }
  }
}