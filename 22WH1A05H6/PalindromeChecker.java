package javapractice;
import java.util.Scanner;
public class PalindromeChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (isPalindrome(number)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }
	        
	        scanner.close();
	    }
	    private static boolean isPalindrome(int num) {
	        int originalNum = num;
	        int reversedNum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        
	        return originalNum == reversedNum;
	    }
	}
