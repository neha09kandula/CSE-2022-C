package LabInternal;

public class throwsEx{
	    int divide(int a, int b) throws ArithmeticException {

	        if (b!= 0) {

	            return (a / b);

	        } else {

	            throw new ArithmeticException("Cannot divide by 0");
	        }
	    }
	    public static void main(String[] args) {

	        throwEx b = new throwEx();

	        try {

	            int result = b.divide(3, 0);

	            System.out.println("Result: " + result); 

	        } catch (ArithmeticException e) {

	            System.out.println("Exception caught: " + e.getMessage());

	        }
	    }
	}

