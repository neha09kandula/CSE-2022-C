package cse13;
import java.util.Scanner;

public class Strings {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string (s1): ");
	        String s1 = scanner.nextLine();
	        System.out.print("Enter the second string (s2): ");
	        String s2 = scanner.nextLine();
	        String Strings = String(s1, s2);
	        System.out.println("Strings: " + Strings);
	        scanner.close();
	    }

	private static String String(String s1, String s2) {
		 StringBuilder mergedStringBuilder = new StringBuilder();

	        int length1 = s1.length();
	        int length2 = s2.length();
	        int maxLength = Math.max(length1, length2);

	        for (int i = 0; i < maxLength; i++) {
	            if (i < length1) {
	                mergedStringBuilder.append(s1.charAt(i));
	            }
	            if (i < length2) {
	                mergedStringBuilder.append(s2.charAt(i));
	            }
	        }

	        return mergedStringBuilder.toString();
	    }
	}
	
	

