import java.util.*;

class fact {
    public static void main(String args[]) {
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact = 1;

        for (int i = number; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial is: " + fact);
        input.close();
    }
}
