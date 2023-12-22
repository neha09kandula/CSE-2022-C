package cseb;
import java.util.Scanner;

public class internal1a {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number");
            try {
                int num = input.nextInt();
                if (num % 2 != 0) {
                    System.out.println("Odd number");
                }
            } 
            catch (Exception e) {
                System.out.println("Invalid input.An exception occured");
            }
        }
    }
}
