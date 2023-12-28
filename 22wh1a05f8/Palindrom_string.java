package my_java_projects;
/*(b) Write a java program to check whether the given string is palindrome or not ?*/

import java.util.*;
public class Palindrom_string {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String s = sc.nextLine();

	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length() / 2; i++) {
	            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome) {
	            System.out.println(" palindrome.");
	        } else {
	            System.out.println("Not a palindrome.");
	        }
	    }
	}

