import java.util.*;
public class pattern{
  public static void main(String args[]){
    int i,j;
    System.out.println("enter the number");
    Scanner s = new Scanner(System.in);
    int row = s.nextInt();
    for(i = 0;i< row;i++){
       for(j =0;j<=i;j++){
            System.out.print("*");
}
    System.out.println();
}
  }
}