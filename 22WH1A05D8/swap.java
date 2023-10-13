import java.util.*;
class swap{
public static void main(String args[]){
   System.out.println("enter a number");
   Scanner s1=new Scanner(System.in);
   Scanner s2=new Scanner(System.in);
   int a=s1.nextInt();
   int b=s2.nextInt();
   System.out.println("before swapping a is"+a); 
   System.out.println("before swapping b is"+b);
   int temp;
   temp=a;
   a=b;
   b=temp;
   System.out.println("after swapping a is "+a);
   System.out.println("after swapping b is" +b);
}
}