import java.util.*;
class factorial{
public static void main(String args[]){
   System.out.println("enter a number");
   Scanner input=new Scanner(System.in);
   int i;
   int fact=1;
   int num=input.nextInt();
   for(i=1;i<=num;i++){
     fact=fact*i;
   }
   {
   System.out.println("is factorial"+fact);
   } 
}
}