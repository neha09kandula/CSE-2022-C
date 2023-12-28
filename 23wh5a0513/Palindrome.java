package cse13;
import java.util.Scanner;

public class Palindrome {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        boolean isPalindrome = Palindrome(inputString);
	        if (isPalindrome) {
	            System.out.println("The given string is a palindrome.");
	        } else {
	            System.out.println("The given string is not a palindrome.");
	        }

	        scanner.close();
	    }

	private static boolean Palindrome(String inputString) {
		 int left = 0;
	        String str = null;
			int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
		return true;
	}
}
