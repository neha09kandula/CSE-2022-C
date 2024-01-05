package csec;
import java.util.Scanner;
	public class SpyNumberChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a non-negative number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        boolean isSpyNumber = isSpyNumber(number);
	        System.out.println("Is " + number + " a SPYNUMBER? " + isSpyNumber);
	    }
	    private static boolean isSpyNumber(int number) {
	        String numberStr = Integer.toString(number);
	        int sumOfDigits = 0;
	        int productOfDigits = 1;
	        for (int i = 0; i < numberStr.length(); i++) {
	            int digit = Character.getNumericValue(numberStr.charAt(i));
	            sumOfDigits += digit;
	            productOfDigits *= digit;
	        }
	        return sumOfDigits == productOfDigits;
	    }
	}

