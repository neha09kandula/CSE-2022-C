

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();

        double greatestNumber = findGreatestNumber(num1, num2, num3);
        System.out.println("The greatest number is: " + greatestNumber);

        scanner.close();
    }

    private static double findGreatestNumber(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
