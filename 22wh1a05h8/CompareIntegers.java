

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();
        System.out.print("Number 4: ");
        int num4 = scanner.nextInt();

        if (areAllEqual(num1, num2, num3, num4)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }

    private static boolean areAllEqual(int num1, int num2, int num3, int num4) {
        return num1 == num2 && num2 == num3 && num3 == num4;
    }
}
