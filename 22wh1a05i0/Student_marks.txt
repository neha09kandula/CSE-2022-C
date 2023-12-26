public class Student {
    private String name;
    private int studentId;
    private int[] marks;
    public Student(String name, int studentId, int[] marks) {
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
    }
    private int calculateTotalMarks() {
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
            if (students[i].calculateTotalMarks() > highestScorer.calculateTotalMarks()) {
                highestScorer = students[i];
            }
        }

        return "Student with the highest score: " + highestScorer.getName();
    }
    public String getName() {
        return name;          
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Vineeth" 515, new int[]{90, 85, 95}),
                new Student("Navya", 513, new int[]{88, 92, 89}),
                new Student("Viya",502, new int[]{78, 85, 92})
        };
        String result = findStudentWithHighestScore(students);
        System.out.println(result);
    }
}
