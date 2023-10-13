import java.util.*;
public class evenodd{
 public static void main(String[] args){
 System.out.println("enter the number");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  if(num%2 == 0){
   System.out.println("num is even");
  }
  else{
   System.out.println("num is odd");
  }
 }
}