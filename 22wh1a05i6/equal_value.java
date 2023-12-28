package Frame;

import java.util.Scanner;

public class equal_value 
{
	 public static void main(String args []){
	        Scanner sc= new Scanner(System.in);
	        System.out.println(" enter the number");
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int n3=sc.nextInt();
	        int n4=sc.nextInt();
	       if(n1==n2 && n2==n3 && n3==n4 && n4==n1) {
	        System.out.println(" all numbers are equal");
	     }
	     else{
	         System.out.println(" unequal");
	     }
	}

}
