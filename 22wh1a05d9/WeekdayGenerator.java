package javapractice;
import java.util.Scanner;
public class WeekdayGenerator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int userInput = scanner.nextInt();

	        try {
	            String weekdayName = getWeekdayName(userInput);
	            System.out.println("Weekday: " + weekdayName);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	        scanner.close();
	    }
	    private static String getWeekdayName(int number) {
	        switch (number) {
	            case 1:
	                return "Sunday";
	            case 2:
	                return "Monday";
	            case 3:
	                return "Tuesday";
	            case 4:
	                return "Wednesday";
	            case 5:
	                return "Thursday";
	            case 6:
	                return "Friday";
	            case 7:
	                return "Saturday";
	            default:
	                throw new IllegalArgumentException("Invalid input. Enter a number between 1 and 7.");
	        }
	    }
	}

