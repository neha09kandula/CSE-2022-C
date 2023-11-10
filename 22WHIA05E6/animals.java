public class animals
{
String x = "lion";
String y = "tiger";
public static void main(String args[])
{
animals obj1 = new animals();
System.out.println(obj1.x);
System.out.println(obj1.y);
}
}





class Student {
    int rollNumber;
    String name;

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class MultipleObjectsExample {
    public static void main(String[] args) {
        // Create multiple objects of the Student class
        Student student1 = new Student();
        student1.rollNumber = 101;
        student1.name = "John";

        Student student2 = new Student();
        student2.rollNumber = 102;
        student2.name = "Alice";

        // Call the display method for each object
        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();
    }
}




