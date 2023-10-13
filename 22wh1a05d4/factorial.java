import java.util.*;
 class factorial{
 public static void main(String[] args){
  
  System.out.println("enter the number: ");
  Scanner obj=new Scanner(System.in);
  int num=obj.nextInt();
  int fact=1;
  int i;
  for(i=1;i<=num;i++){
  fact=fact*i;
}
  System.out.println("factorial of given number is: "+fact);
}
}
