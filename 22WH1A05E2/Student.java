package lab_questions;

public class Student {
    private String name;
    private int studentId;
    private int[] marks;

    public Student(String name, int studentId, int[] marks) {
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public static Student findStudentWithHighestScore(Student[] students) {
        if (students == null || students.length == 0) {
            return null;
        }

        Student highestScorer = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateTotalMarks() > highestScorer.calculateTotalMarks()) {
                highestScorer = students[i];
            }
        }

        return highestScorer;
    }

    public String toString() {
        return "Student{name='" + name + "', studentId=" + studentId + '}';
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Varsha", 515, new int[]{90, 85, 95}),
                new Student("Trisha", 513, new int[]{88, 92, 89}),
                new Student("Ajay", 502, new int[]{78, 85, 92})
        };

        Student highestScorer = findStudentWithHighestScore(students);
        if (highestScorer != null) {
            System.out.println("Student with the highest score: " + highestScorer);
        } else {
            System.out.println("No students provided.");
        }
    }
}
