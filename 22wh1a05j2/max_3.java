import java.util.*;
public class max_3{
 public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("enter a number x1");
      int x1=input.nextInt();
	System.out.println("enter the second number x2");
	int x2=input.nextInt();
	System.out.println("enter the 3rd number x3");
	int x3=input.nextInt();
	if(x1==x2 && x2==x3){
          	System.out.println("all the given numbers are equal");	
		}
	else if(x1>x2 ){
		if(x1>x3)
           		System.out.println("x1 is greater");
		else
			System.out.println("x3 is greater");
	 }
	else {
		if(x2>x3)
      		   System.out.println("x2 is greater");
		else
		   System.out.println("x3 is greater");
	}

}

}