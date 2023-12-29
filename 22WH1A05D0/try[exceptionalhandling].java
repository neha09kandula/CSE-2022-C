public class exceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the specific exception (ArithmeticException in this case)
            System.out.println("Error: Division by zero");
        } finally {
            // Optional block that always executes whether an exception occurs or not
            System.out.println("Finally block executed");
        }
    }
    public static int divide(int a, int b) {    
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
