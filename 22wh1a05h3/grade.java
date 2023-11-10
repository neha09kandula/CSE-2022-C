package udemyexcercise;

import java.util.*;

public class grade {
    private static int marks;

    public static char assignGrade() {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else if (marks >= 50 && marks < 60) {
            return 'E';
        } else if (marks < 0 || marks > 100) {
            return 'X';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        marks = input.nextInt();
        char grade = assignGrade();
        System.out.println("Grade: " + grade);
        input.close();
    }
}
