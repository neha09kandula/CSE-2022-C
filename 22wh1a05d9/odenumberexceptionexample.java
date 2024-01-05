package javapractice;

public class OddNumberExceptionExample {
	    public static void main(String[] args) {
	        try {
	            checkIfEven(5);
	        } catch (OddNumberException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	    private static void checkIfEven(int number) throws OddNumberException {
	        if (number % 2 != 0) {
	            throw new OddNumberException("Odd numbers are not allowed");
	        } else {
	            System.out.println("The number is even.");
	        }
	    }
	}
	class OddNumberException extends Exception {
	    public OddNumberException(String message) {
	        super(message);
	    }
	}
