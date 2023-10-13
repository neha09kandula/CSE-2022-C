import java.util.*;
public class evenorodd{
  public static void main(String args[]){
    System.out.println("enter the number");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if(num%2 == 0){
     System.out.println(num+" is even number.");
}else{
    System.out.print(num+" is odd number.");
  }
  }
}