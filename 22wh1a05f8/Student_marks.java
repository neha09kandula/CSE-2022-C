package my_java_projects;
/*You are creating a student grading system. Each student has a name, student ID, and a list
of marks for different subjects. Implement a class in Java to represent a student and display
the student’s name who is having highest score.*/
import java.util.*;
import java.util.Scanner;

public class Student_marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] studentIDs = new int[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            names[i] = sc.nextLine();

            System.out.println("Enter student ID:");
            studentIDs[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter student marks:");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (marks[i] > marks[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Student with the highest marks:");
        System.out.println("Name: " + names[maxIndex]);
        System.out.println("Marks: " + marks[maxIndex]);
    }
}

