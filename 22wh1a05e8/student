import java.util.*;

public class Student {
    String name;
    String studentID;
    List<Integer> marks;

    public Student(String name, String studentID, List<Integer> marks) {
        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getHighestScore() {
        int highestScore = Integer.MIN_VALUE;
        for (int mark : marks) {
            highestScore = Math.max(highestScore, mark);
        }
        return highestScore;
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "S001", Arrays.asList(80, 90, 85)));
        students.add(new Student("Jane", "S002", Arrays.asList(75, 85, 95)));
        students.add(new Student("Alice", "S003", Arrays.asList(90, 95, 100)));

        Student studentWithHighestScore = null;
        int highestScore = Integer.MIN_VALUE;
        for (Student student : students) {
            int score = student.getHighestScore();
            if (score > highestScore) {
                highestScore = score;
                studentWithHighestScore = student;
            }
        }

        System.out.println("The student with the highest score is " + studentWithHighestScore.getName());
    }
