package cse_c;
public class Generates_integer {
	import java.util.Scanner;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number between 1 and 7: ");
	        int userNumber = scanner.nextInt();

	        try {
	            String weekdayName = getWeekdayName(userNumber);
	            System.out.println("The weekday is: " + weekdayName);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close(); 
	        }
	    
	    static String getWeekdayName(int number) {
	        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	        if (number < 1 || number > 7) {
	            throw new IllegalArgumentException("Invalid input. Please enter a number between 1 and 7.");
	        }

	        return weekdays[number - 1];
	    }
	    }
