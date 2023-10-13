import java.util.*;
class pattern{
public static void main(String args[]){
   System.out.println("enter a number");
   Scanner input=new Scanner(System.in);
   int i,j;
   int row=input.nextInt();
   for(i=0;i<row;i++){
      for(j=0;j<=i;j++){
    System.out.print("*");
   }
   System.out.println();
   }
}
}