public class Exception2 {

    // A method that declares it may throw ArithmeticException
    static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            // Calling the method and handling the exception
            int result = divide(10, 5);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
