import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = scanner.nextInt();

        System.out.println("Enter the fourth integer:");
        int num4 = scanner.nextInt();
        scanner.close();
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
