package labprograms;
import java.util.*;

class Student {
    String name;
    int id;
    int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}
public class Grade {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = scan.nextInt();

        // Create an ArrayList to store student objects
        ArrayList<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scan.nextLine(); // consume the newline character
            System.out.println("Enter the name of the student");
            String name = scan.nextLine();
            System.out.println("Enter the ID of the student");
            int id = scan.nextInt();
            System.out.println("Enter the marks of the student");
            int marks = scan.nextInt();

            // Create a new Student object and add it to the ArrayList
            studentsList.add(new Student(name, id, marks));
        }

        // Close the Scanner
        scan.close();

        // Find the student with the highest marks
        Student highestScorer = findHighestScorer(studentsList);

        // Print the details of the student with the highest marks
        if (highestScorer != null) {
            System.out.println("Student with the highest marks:");
            System.out.println("Name: " + highestScorer.name + ", ID: " + highestScorer.id + ", Marks: " + highestScorer.marks);
        } else {
            System.out.println("No students entered.");
        }
    }

    // Function to find the student with the highest marks
    private static Student findHighestScorer(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return null; // Return null if the list is empty
        }

        // Initialize with the first student
        Student highestScorer = students.get(0);

        // Iterate through the list to find the student with the highest marks
        for (Student student : students) {
            if (student.marks > highestScorer.marks) {
                highestScorer = student;
            }
        }

        return highestScorer;
    }
}
