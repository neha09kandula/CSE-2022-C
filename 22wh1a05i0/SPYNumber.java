import java.util.Scanner;

public class SpyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();

        boolean isSpyNumber = isSpyNumber(number);

        System.out.println("Is it a SPYNUMBER? " + isSpyNumber);
    }
    private static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        // Calculate the sum and product of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }
}
