package mypackage;
import java.util.Scanner;
public class Spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner read = new Scanner(System.in);
     int num = read.nextInt();
     int temp = num;
     int sum =0,prod=1,r=0;
     while(num!=0)
     {
  	   r = num%10;
  	  sum=sum+r;
  	  prod = prod*r;
  	   num=num/10;
     }
     
     if(sum==prod)
     {
    	 System.out.println("True");
     }
     else
     {
    	 System.out.println("False");
     }
	}

}
