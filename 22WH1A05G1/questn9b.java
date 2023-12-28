import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Equal: All four integers are equal.");
        } else {
            System.out.println("Not Equal: The four integers are not equal.");
        }
    }
}
