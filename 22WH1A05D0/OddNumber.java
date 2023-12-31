package cse225d0;

public class OddNumber {

    public static void main(String[] args) {
        try {
            int number = 8; // You can change this number to test different cases
            checkEvenNumber(number);
            System.out.println(number + " is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: " + number + " is an odd number.");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

