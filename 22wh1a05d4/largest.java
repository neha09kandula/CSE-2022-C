import java.util.*;
 class largest{
 public static void main(String[] args){
  
  System.out.println("enter three numbers: ");
  Scanner obj=new Scanner(System.in);
  int a=obj.nextInt();
  int b=obj.nextInt();
  int c=obj.nextInt();
  if (a==b && a==c){
   System.out.println(" all numbers are equal");}
  else if(a>=b && a>=c){
   System.out.println("largest number is: "+a);}
  else if(b>=c){
   System.out.println("largest number is: "+b);}
  else{
   System.out.println("largest number is: "+c);}
   

}
}
