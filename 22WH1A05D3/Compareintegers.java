package cse225d3;

import java.util.Scanner;
public class Compareintegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a = scanner.nextInt();
        System.out.println("Enter the second integer:");
        int b = scanner.nextInt();
        System.out.println("Enter the third integer:");
        int c = scanner.nextInt();
        System.out.println("Enter the fourth integer:");
        int d = scanner.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        scanner.close();
    }
}