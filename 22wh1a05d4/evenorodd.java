import java.util.*;
 class evenorodd{
 public static void main(String[] args){
  
  System.out.println("enter the number: ");
  Scanner obj=new Scanner(System.in);
  int num=obj.nextInt();
  if (num%2==0){
  System.out.println("number is even");
  }
  else if(num%2!=0)
  {System.out.println("number is odd");}
}
}
