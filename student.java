import java.io.*;
import java.util.Scanner;

public class student {
    private String name;
    private int id,marks;
    public student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        student[] students = new student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student " + (i + 1) + " ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter student " + (i + 1) + " marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            students[i] = new student(name, id, marks);
        }
        student highestScorer = students[0];
        for (int i = 1; i < numStudents; i++) {
            if (students[i].getMarks() > highestScorer.getMarks()) {
                highestScorer = students[i];
            }
        }
        System.out.println(highestScorer.getName() + " has the highest marks.");
    }
}