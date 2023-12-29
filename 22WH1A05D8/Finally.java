package cse225d8;

public class Finally {
	 public static void main(String []args) {
   	  int a,b;
   	  try {
   		  a=5;
   		  b=30/a;
   		  System.out.println("RESULT:" + b);
   	  }
   	  catch(Exception e) {
   		  System.out.println("ArithmeticException:: Divide by Zero!!");
   	  }
   	finally {
   		System.out.println ("No Exception");
   		}
   		} 
    }
