

import java.util.Scanner;

public class spyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();
        boolean result = checkSpyNumber(number);
        System.out.println(result);
        scanner.close();
    }

    private static boolean checkSpyNumber(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }
}
