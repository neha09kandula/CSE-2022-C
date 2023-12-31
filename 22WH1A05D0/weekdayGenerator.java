package cse225d0;
	import java.util.Scanner;

	public class weekdayGenerator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from the user
	        System.out.print("Enter a number between 1 and 7: ");
	        int userInput = scanner.nextInt();

	        // Check if the input is within the valid range
	        if (userInput >= 1 && userInput <= 7) {
	            // Call the method to get the weekday name
	            String weekdayName = getWeekdayName(userInput);

	            // Display the weekday name
	            System.out.println("The weekday corresponding to " + userInput + " is: " + weekdayName);
	        } else {
	            System.out.println("Invalid input. Please enter a number between 1 and 7.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to get the weekday name based on the input number
	    private static String getWeekdayName(int dayNumber) {
	        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
	        return weekdays[dayNumber - 1];
	    }
	}
