import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }

    static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
