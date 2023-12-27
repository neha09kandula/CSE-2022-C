package frames;
import java.util.Scanner;

public class internal_6 {
    String name;
    String studentID;
    int marks; 

    public internal_6(String name, String studentID, int marks) {
        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getMarks() {
        return marks;
    }

    public static internal_6 findStudentWithHighestScore(internal_6[] students) {
        if (students == null || students.length == 0) {
            return null;
        }

        internal_6 highestScorer = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMarks() > highestScorer.getMarks()) {
                highestScorer = students[i];
            }
        }
        return highestScorer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the first student:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Student ID: ");
        String studentID1 = scanner.nextLine();
        System.out.print("Enter Math marks: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter Science marks: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter English marks: ");
        int marks3= scanner.nextInt();
        scanner.nextLine(); 

        internal_6 student1 = new internal_6(name1, studentID1, marks3);

        System.out.println("\nEnter details for the second student:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Student ID: ");
        String studentID2 = scanner.nextLine();
        System.out.print("Enter Math marks: ");
        marks1 = scanner.nextInt();
        System.out.print("Enter science marks: ");
        marks2 = scanner.nextInt();
        System.out.print("Enter English marks: ");
        marks3 = scanner.nextInt();
        scanner.nextLine(); 

        internal_6 student2 = new internal_6(name2, studentID2, marks2);

        internal_6[] students = { student1, student2 };

        internal_6 highestScorer = findStudentWithHighestScore(students);
        if (highestScorer != null) {
            System.out.println("\nStudent with the highest score: " + highestScorer.getName());
        } else {
            System.out.println("\nNo students available.");
        }
    }
}