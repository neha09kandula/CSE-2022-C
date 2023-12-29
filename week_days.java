import java.util.Scanner;
public class WeekdayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int userInput = scanner.nextInt();

        // Validate the input
        if (userInput < 1 || userInput > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
	else {
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            String weekdayName = weekdays[userInput - 1];
            System.out.println("The weekday corresponding to " + userInput + " is " + weekdayName + ".");
        }
        scanner.close();
    }
}
