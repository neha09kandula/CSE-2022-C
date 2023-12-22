package labinternal5d1;
import java.util.*;

public class spynumber {
     static void spynumber1(int a) {
    	  int sum=0,prod=1,temp=a;
    	  while(temp>0) {
    		  int digit=temp%10;
    		  sum=sum+digit;
    		  prod=prod*digit;
    		  temp=temp/10;
    		   		  
    	  }
    	  if(sum==prod) {
    		  System.out.println("true");
    	  }
    	  else {
    		  System.out.println("false");
    	  }
      }
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  int b=sc.nextInt();
    	  spynumber n=new spynumber();
    	  n.spynumber1(b);
      }
}



