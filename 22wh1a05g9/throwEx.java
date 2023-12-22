package LabInternal;

public class throwEx {
	    int divide(int a, int b) {

	        if (b != 0) {

	            return (a / b);

	        } else {

	            // Throw an exception (ArithmeticException in this case)

	            throw new ArithmeticException("Cannot divide by 0");
	        }
	    }
	    public static void main(String[] args) {

	        throwEx b = new throwEx();

	        try {

	            int result = b.divide(3, 0);

	            System.out.println("Result: " + result); // This line will not be reached if an exception occurs

	        } catch (ArithmeticException e) {

	            System.out.println("Exception caught: " + e.getMessage());

	        }
	    }
	}
