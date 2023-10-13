import java.util.*;
public class factorial{
  public static void main(String args[]){
    int i;
    int fact = 1;
    System.out.println("enter the number");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    for(i = 1;i<=num;i++){
       fact = fact*i;
}
    System.out.print(" factorial of "+num+" is "+ fact);
  }
}