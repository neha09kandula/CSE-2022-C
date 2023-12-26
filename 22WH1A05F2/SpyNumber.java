import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        boolean isSpyNumber = isSpyNumber(number);
        System.out.println(isSpyNumber);
    }
    private static boolean isSpyNumber(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }
}