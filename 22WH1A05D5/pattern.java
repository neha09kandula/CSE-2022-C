import java.util.*;
public class pattern{
 public static void main(String[] args){
 System.out.println("enter the number of rows:");
  Scanner sc = new Scanner(System.in);
  int rows = sc.nextInt();
  int i,j;
  for(i=0;i<rows;i++){
  for(j=0;j<=i;j++){
  System.out.print("*");}
 System.out.println(" ");}
  }
}