package javaprograms;
import java.util.*;
public class Student {
    private String name;
    private int studentId;
    private int[] marks;
    public Student(String name, int studentId, int[] marks) {
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
    }
    private int totalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
    public static String findStudentWithHighestScore(Student[] students) {
        if (students == null || students.length == 0) {
            return "No students provided.";
        }

        Student highestScorer = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].totalMarks() > highestScorer.totalMarks()) {
                highestScorer = students[i];
            }
        }

        return "Student with highest score: " + highestScorer.getName();
    }
    public String getName() {
        return name;          
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Rishi", 560, new int[]{80, 90, 97}),
                new Student("Divya", 690, new int[]{60, 65, 69}),
                new Student("Vinay",390, new int[]{70, 75, 78})
        };
        String result = findStudentWithHighestScore(students);
        System.out.println(result);
    }
}
