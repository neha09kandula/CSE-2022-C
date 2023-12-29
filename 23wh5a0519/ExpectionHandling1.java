package expection;

public class ExpectionHandling1 {
	    public static void main(String[] args) {
	        try {
	            
	            int result = divide(10, 0);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	           
	            System.out.println("Error: Cannot divide by zero");
	        } 
	        finally {
	            
	            System.out.println("Finally block executed");
	        }

	       
	        System.out.println("Program continues...");
	    }

	    
	    
	    public static int divide(int numerator, int denominator) {
	        return numerator / denominator;
	    }
	}



