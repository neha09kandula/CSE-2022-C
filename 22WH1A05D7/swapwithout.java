import java.util.*;
public class swapwithout{
  public static void main(String args[]){
    System.out.println("enter the numbers");
   
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    int a = s1.nextInt();
    int b = s2.nextInt();
    System.out.println("before swapping a is "+a);
    System.out.println("before swapping b is "+b);
    a = a+b;
    b = a-b;
    a = a-b;
     System.out.println("after swapping a is "+a);
    System.out.println("after swapping b is "+b);

  }
}