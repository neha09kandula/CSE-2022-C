package cse_c;

public class OddNumberChecker {
	public static void main(String[] args) {
		try {
			int numberToCheck = 7; // Replace this with the number you want to check
	        checkEvenNumber(numberToCheck);
	        System.out.println(numberToCheck + " is an even number.");
	        } catch (OddNumberException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    static void checkEvenNumber(int number) throws OddNumberException {
	        if (number % 2 != 0) {
	            throw new OddNumberException("Error: Odd number detected!");
	        }
	    }
	}

	class OddNumberException extends Exception {
	    public OddNumberException(String message) {
	        super(message);
	    }
	}
	

