import java.util.*;
class Student {
	str studemt_name;
	int maths_marks ,physics_marks ,chemistry_marks ,total_marks;
	float avg;
	
	void inputData() {
	Scanner sc = new scanner(system.in)
	System.out.println("enter the name of the student: ")
	name = sc.next();
	System.out.println("enter the marks in maths: ")
	maths_marks = sc.nextInt();
	System.out.println("enter the marks in physics: ")
	physics_marks = sc.nextInt();
	System.ouut.println("enter the marks in chemistry: ")
	chemistry_marks = sc.nextInt();
	}

	void marksCalculation() {
	tolat_marks = (maths_marks + physics_marks + chemistry_marks);
	avg = (total_marks / 3)
	}

	void outputData() {
	System.out.println("total of all 3 subjects is: " +total_marks);
	System.out.println("average of all 3 subjects is: " +avg);
	}
}

class Marks {
public static void main(String[] args) {
Student s = new student();
	s.inputData();
	s.marksCalculation();
	s.outputData();
	}
}
	