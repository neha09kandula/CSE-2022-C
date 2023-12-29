package labprograms;
import java.util.*;
public class evenchecker {

	

	    public static void main(String[] args) {
	        try {
	            int number = 7; // You can change this number to test different cases
	            checkEvenNumber(number);
	            System.out.println(number + " is an even number.");
	        } catch (OddNumberException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    static void checkEvenNumber(int number) throws OddNumberException {
	        if (number % 2 != 0) {
	            throw new OddNumberException("Error: Odd number found.");
	        }
	    }
	}

	class OddNumberException extends Exception {
	    public OddNumberException(String message) {
	        super(message);
	    }
	

}
