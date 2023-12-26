package javaprograms;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = obj.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        }
	 else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
    private static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;
        while (n > 0) {
            int remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
