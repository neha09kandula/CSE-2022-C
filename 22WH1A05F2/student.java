import java.util.*;
public class student
{
    public static void main(String args[])
    {
        System.out.println("details of student");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Enter your gender: ");
        String gender = input.next();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your phoneno: ");
        long phoneno = input.nextLong();
        System.out.println("Enter your branch: ");
        String branch = input.next();
        System.out.println("Name of the Student: "+name);
        System.out.println("Roll number: "+rollno);
        System.out.println("Branch: "+branch);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+phoneno);
    }
}

