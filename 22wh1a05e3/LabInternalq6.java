import java.util.*;
public class LabInternalq6 {
    private String name;
    private int studentId;
    private String[] subjects;
    private int[] marks;

    public Student(String name, int studentId, String[] subjects, int[] marks) {
        this.name = name;
        this.studentId = studentId;

        // Assuming subjects and marks arrays are of the same length
        this.subjects = subjects.clone();
        this.marks = marks.clone();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String[] getSubjects() {
        return subjects.clone();
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public String getStudentWithHighestScore() {
        int highestScore = Integer.MIN_VALUE;
        String studentWithHighestScore = null;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > highestScore) {
                highestScore = marks[i];
                studentWithHighestScore = name;
            }
        }

        return studentWithHighestScore;
    }

    public static void main(String[] args) {
        // Example usage
        String[] subjects = {"Math", "English", "History"};
        int[] student1Marks = {90, 85, 92};
        int[] student2Marks = {88, 95, 89};

        LabInternalq6 student1 = new LabInternalq6("John Doe", 1001, subjects, student1Marks);
        LabInternalq6 student2 = new LabInternalq6("Jane Smith", 1002, subjects, student2Marks);

        // Display the student with the highest score
        String studentWithHighestScore = student1.getStudentWithHighestScore();
        System.out.println("Student with the highest score: " + studentWithHighestScore);
    }
}
