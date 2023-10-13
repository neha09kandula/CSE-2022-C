import java.util.*;
class evenorodd{
public static void main(String args[]){
   System.out.println("enter a number");
   Scanner input=new Scanner(System.in);
   int num=input.nextInt();
   if(num % 2 == 0){
   System.out.println(num+"is division by 2");
   } 
   else{
   System.out.println(num+"is not divisible by 2");
   }
}
}