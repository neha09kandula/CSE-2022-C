/*Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.*/
import java.util.*;
public class Interst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Candidate:");
        String name=sc.nextLine();
        System.out.print("Enter the Roll number of the Candidate:");
        String roll=sc.nextLine();
        System.out.print("Enter the name of the branch which you are intrested:\n 1.CSE 2.IT 3.ECE 4.EEE 5.CSM:");
        String branch=sc.nextLine();
        System.out.println("Hey, my name is "+name+" and my roll number is "+roll+".My field of interest are "+branch+".");
    }
}
