package my_java_projects;
/*9b*/
import java.util.*;
public class Equality_checker {
	
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

        if (areAllEqual(num1, num2, num3, num4)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        scanner.close();
    }

    private static boolean areAllEqual(int a, int b, int c, int d) {
        return (a == b) && (b == c) && (c == d);
    }
}

