import java.util.*;
public class div{
 public static void main(String[] args){
 System.out.println("enter the number");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  if(num%5 == 0){
   System.out.println("num is div by 5");
  }
  else{
   System.out.println("num is not div by 5");
  }
 }
}