package mypackage;
import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String str1 = read.nextLine();
        String reverseStr = "";
        char ch;
        for (int i = str1.length()-1; i >= 0; i--) {
            ch = str1.charAt(i);
            reverseStr = reverseStr + ch;
        }

        if (reverseStr.equals(str1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
	}

}
