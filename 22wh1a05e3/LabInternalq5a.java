public class LabInternalq5a {

    public static void main(String[] args) {
        try {
            int number = 5; // Replace 5 with the desired number
            checkIfEven(number);
            System.out.println(number + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println(e.getmessage());
        }
    }

    static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Odd number detected!");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
