import java.util.Scanner;
public class MergeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string (s1): ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string (s2): ");
        String s2 = scanner.nextLine();
        String mergedString = mergeStrings(s1, s2);
        System.out.println("Merged String: " + mergedString);
        scanner.close();
    }
    static String mergeStrings(String s1, String s2) {
        String mergedString = s1.concat(s2);
        return mergedString;
    }
}
