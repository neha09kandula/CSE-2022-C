package javaprograms;
import java.util.*;
public class spynumber {
     static void spynumber1(int c) {
    	  int sum=0,prod=1,temp=c;
    	  while(temp>0) {
    		  int digit=temp%10;
    		  sum=sum+digit;
    		  prod=prod*digit;
    		  temp=temp/10;
    		   		  
    	  }
    	  if(sum==prod) {
    		  System.out.println("It is spynumber");
    	  }
    	  else {
    		  System.out.println("Not a spynumber");
    	  }
      }
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  int a=sc.nextInt();
    	  spynumber obj=new spynumber();
    	 obj.spynumber1(a);
      }
}



