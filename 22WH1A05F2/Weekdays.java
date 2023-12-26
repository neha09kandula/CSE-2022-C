import java.util.*;
public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int Inp = sc.nextInt();
        if (Inp >= 1 && Inp <= 7) {
            String weekdayName = getWeek(Inp);
            System.out.println("The weekday for " + Inp + " is: " + weekdayName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
    private static String getWeek(int dayNumber) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int index = dayNumber - 1;
        return weekdays[index];
    }
}