package javapractice;
import java.util.Scanner;
public class PalindromeChecker_2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        if (isPalindrome(inputString)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }

	        scanner.close();
	    }
	    private static boolean isPalindrome(String str) {
	        String reversedString = new StringBuilder(str).reverse().toString();
	        return str.equals(reversedString);
	    }
	}

