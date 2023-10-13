import java.util.*;
 class swapwith{
 public static void main(String[] args){
  
  System.out.println("enter two numbers: ");
  Scanner obj=new Scanner(System.in);
  int a=obj.nextInt();
  int b=obj.nextInt();
  int temp=0;
  temp=a;
  a=b;
  b=temp; 
 
  System.out.println("a = "+a+" b = "+b);
}
}