import java.util.*;
public class swapping{
 public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("enter a number a");
      int a=input.nextInt();
	
	System.out.println("enter the second num b:");
	
	int b=input.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping \n a value is: "+a+", b value is :"+b);


}

}