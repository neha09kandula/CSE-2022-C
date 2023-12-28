package javapractice;
import java.util.Scanner;
public class StringMerger {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String s1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String s2 = scanner.nextLine();
	        String mergedString = mergeStrings(s1, s2);
	        System.out.println("Merged String: " + mergedString);
	        scanner.close();
	    }
	    private static String mergeStrings(String s1, String s2) {
	        return s1 + s2;
	    }
	}


