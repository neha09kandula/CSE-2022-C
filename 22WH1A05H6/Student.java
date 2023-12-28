package csec;
import java.util.HashMap;
import java.util.Map;
public class Student {
	    private String name;
	    private String studentId;
	    private Map<String, Double> subjectMarks;
	    public Student(String name, String studentId, Map<String, Double> subjectMarks) {
	        this.name = name;
	        this.studentId = studentId;
	        this.subjectMarks = subjectMarks;
	    }
	    public static String findStudentWithHighestScore(Student[] students) {
	        if (students.length == 0) {
	            return "No students to evaluate.";
	        }

	        Student highestScorer = students[0];

	        for (int i = 1; i < students.length; i++) {
	            if (calculateTotalMarks(students[i]) > calculateTotalMarks(highestScorer)) {
	                highestScorer = students[i];
	            }
	        }

	        return "Student with the highest score:\nName: " + highestScorer.getName();
	    }
	    private static double calculateTotalMarks(Student student) {
	        double totalMarks = 0;
	        for (double marks : student.subjectMarks.values()) {
	            totalMarks += marks;
	        }
	        return totalMarks;
	    }
	    public String getName() {
	        return name;
	    }
	    public static void main(String[] args) {
	        Student student1 = new Student("John", "A123", createSubjectMarks(90, 85, 92));
	        Student student2 = new Student("Alice", "B456", createSubjectMarks(88, 95, 89));
	        Student student3 = new Student("Bob", "C789", createSubjectMarks(92, 87, 94));
	        Student[] students = {student1, student2, student3};
	        System.out.println(Student.findStudentWithHighestScore(students));
	    }
	    private static Map<String, Double> createSubjectMarks(double subject1, double subject2, double subject3) {
	        Map<String, Double> subjectMarks = new HashMap<>();
	        subjectMarks.put("Subject1", subject1);
	        subjectMarks.put("Subject2", subject2);
	        subjectMarks.put("Subject3", subject3);
	        return subjectMarks;
	    }
	}
