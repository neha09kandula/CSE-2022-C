package udemyexcercise;

public class squareofnaturalnumbers {
	    public static long calculateSumOfSquares(int n) {
	       // write your code here
	       long sum;
	       if(n<0)
	       {
	           return -1;
	       }
	       else{
	          sum=(n*(n+1)*(2*n+1)/6);
	          return sum;
	       }
	    }
	    public static void main(String[]args)
	    {
	    	System.out.println(calculateSumOfSquares(3));
	    }
	}
