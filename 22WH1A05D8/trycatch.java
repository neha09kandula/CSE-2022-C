package cse225d8;

public class trycatch {
      public static void main(String []args) {
    	  int a,b;
    	  try {
    		  a=0;
    		  b=30/a;
    		  System.out.println(b);
    	  }
    	  catch(Exception e) {
    		  System.out.println("ArithmeticException:: Divide by Zero!!");
    	  }
      }
}
