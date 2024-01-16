package java_5e3;
import java.util.*;


public class type_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integerValue = scanner.nextInt();
        double doubleValue = (double) integerValue;

        System.out.println("Integer Value: " + integerValue);
        System.out.println("Double Value: " + doubleValue);
        scanner.close();
    }
}


	