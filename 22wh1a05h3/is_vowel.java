package udemyexcercise;

public class is_vowel {
	    // Method to determine if a character is a vowel
	    public static boolean isVowel(char ch) {

	        // Use a switch statement to check for each vowel, both lowercase and uppercase
	        switch (ch) {
	            case 'a':
	            case 'A':
	            case 'e':
	            case 'E':
	            case 'i':
	            case 'I':
	            case 'o':
	            case 'O':
	            case 'u':
	            case 'U':
	                return true;
	            default:
	                return false;
	        }
	    }
	    public static void main(String[]args)
	    {
	    	System.out.println(isVowel('a'));
	    }
	}
