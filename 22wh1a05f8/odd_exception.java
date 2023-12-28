package my_java_projects;
/*5a*/
import java.util.*;
public class odd_exception {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        try {
	            if (number % 2 != 0) {
	                throw new Exception("The number is odd!");
	            }
	            System.out.println(number + " is even.");
	        } catch (Exception e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        } 
	    }
}

