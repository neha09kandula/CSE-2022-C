import java.util.Scanner;

public class WeekdayNameGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int userInput = scanner.nextInt();

        if (userInput >= 1 && userInput <= 7) {
            String weekday = getWeekdayName(userInput);
            System.out.println("Weekday for number " + userInput + " is: " + weekday);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
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
                return "Invalid";
        }
    }
}