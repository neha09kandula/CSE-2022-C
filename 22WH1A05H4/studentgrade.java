package programs;
public class Stugrade {
    private String name;
    private int studentID;
    private double[] marks;

    public Stugrade(String name, int studentID, int numSubjects) {
        this.name = name;
        this.studentID = studentID;
        this.marks = new double[numSubjects];
    }

    
    public void addMark(int subjectIndex, double mark) {
        if (subjectIndex >= 0 && subjectIndex < marks.length) {
            marks[subjectIndex] = mark;
        } else {
            System.out.println("Invalid subject index.");
        }
    }

  
    public double calculateTotalMarks() {
        double total = 0.0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public static void main(String[] args) {
      
        Stugrade student1 = new Stugrade("Swathi", 123, 3);
        student1.addMark(0, 90.5);
        student1.addMark(1, 85.0);
        student1.addMark(2, 92.3);

        Stugrade student2 = new Stugrade("vennela", 456, 3);
        student2.addMark(0, 88.0);
        student2.addMark(1, 91.2);
        student2.addMark(2, 89.5);


        Stugrade highestScorer = student1;

        if (student2.calculateTotalMarks() > student1.calculateTotalMarks()) {
            highestScorer = student2;
        }

        System.out.println("Student with the highest total score: " + highestScorer.name);
    }
}