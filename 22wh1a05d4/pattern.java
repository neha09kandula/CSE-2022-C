import java.util.*;
 class pattern{
 public static void main(String[] args){
  
  System.out.println("enter number of rows: ");
  Scanner obj=new Scanner(System.in);
  int rows=obj.nextInt();
  int i,j;
  for(i=0;i<rows;i++){
   for(j=0;j<=i;j++){
     System.out.print(" * ");}
     System.out.println(" ");}
}
}  

