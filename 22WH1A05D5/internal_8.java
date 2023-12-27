package frames;

import java.util.Scanner;

public class internal_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isSpyNumber = isSpyNumber(number);
        System.out.println("Is the number a spynum" + " " +isSpyNumber);
    }

public static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }
}