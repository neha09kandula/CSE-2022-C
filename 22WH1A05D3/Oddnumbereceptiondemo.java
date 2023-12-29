package cse225d3;

import java.util.Scanner;
public class Oddnumbereceptiondemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int userInput = scanner.nextInt();
        try {
            checkEvenNumber(userInput);
            System.out.println(userInput + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        }
    }
}
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}