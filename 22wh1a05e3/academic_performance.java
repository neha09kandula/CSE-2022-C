package java_5e3;
import java.util.Scanner;

public class academic_performance {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
		int numSubjects = scanner.nextInt();
        int[] scores = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
		     System.out.print("Enter the score for subject " + (i + 1) + ": ");
		     scores[i] = scanner.nextInt();
		     }
		 int totalScore = 0;
		 for (int score : scores) {
		      totalScore += score;
		 }
		       
		 double averageScore = (double) totalScore / numSubjects;
		 System.out.println("Total Score: " + totalScore);
		 System.out.println("Average Score: " + averageScore);
		 char grade = determineGrade(averageScore);
		 System.out.println("Grade: " + grade);
         scanner.close();
		    }

		    // Method to determine the grade based on the average score
		    private static char determineGrade(double averageScore) {
		        if (averageScore >= 90) {
		            return 'A';
		        } else if (averageScore >= 80) {
		            return 'B';
		        } else if (averageScore >= 70) {
		            return 'C';
		        } else if (averageScore >= 60) {
		            return 'D';
		        } else {
		            return 'F';
		        }
		    }


	}

