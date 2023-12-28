package framework;
import java.util.Scanner;
public class Internal5b 

{public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 7: ");
		int Number = scanner.nextInt();

		if (Number < 1 || Number > 7) {
		System.out.println("Invalid input. Please enter a number between 1 and 7.");
		}
		else {
		String weekday = generateWeekday(Number);
		System.out.println("weekday: " + weekday);
		}
		}

		private static String generateWeekday(int number) {
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
		return "Invalid";
		}
		}
		
	}


