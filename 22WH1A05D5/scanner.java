import java.util.Scanner; 

public class scanner { 
    public static void main(String args[]) { 
        System.out.println("Student Details"); 
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Your Name"); 
        String name = input.nextLine(); 
        System.out.println("My Name is: " + name); 
        input.close(); 
    }
}
