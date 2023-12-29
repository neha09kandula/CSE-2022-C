package frames;

import java.util.Scanner;

public class trycatch_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int result = 10 / number;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
        System.out.println("Program continues...");
        scanner.close();
    }
}
