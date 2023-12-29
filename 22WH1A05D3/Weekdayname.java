package cse225d3;
import java.util.Scanner;
public class Weekdayname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        
        String Weekdayname = getWeekdayName(number);
        
        if (Weekdayname != null) {
            System.out.println("The weekday corresponding to the number " + number + " is: " + Weekdayname);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        
        scanner.close();
    }

    public static String getWeekdayName(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return null;
        }
    }
}