package cse13;

public class Trycatch {
   public static void main(String[] args) {
	   int val1,val2;
	   try {
		   val1 = 0;
		   val2 = 2/val1;
		   System.out.println(val2);
	   }
	   catch(ArithmeticException e)
	   {
		System.out.println("ArithmeticException::Divide By Zero!!");   
	   }
	   finally
	   {
		   System.out.println("Execution completed");
	   }
	   
   }
   
}
