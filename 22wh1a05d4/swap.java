import java.util.*;
 class swap{
 public static void main(String[] args){
  
  System.out.println("enter two numbers: ");
  Scanner obj=new Scanner(System.in);
  int a=obj.nextInt();
  int b=obj.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("a = "+a+" b = "+b);
}
}