import java.util.*;
class division{
public static void main(String args[]){
   System.out.println("enter a number");
   Scanner input=new Scanner(System.in);
   int num=input.nextInt();
   if(num % 5 == 0){
   System.out.println(num+"is division by 5");
   } 
   else{
   System.out.println(num+"is not divisible by 5");
   }
}
}