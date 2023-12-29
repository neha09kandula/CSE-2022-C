package mypkg;

public class Exception {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older for this action");
        } else {
            System.out.println("You are eligible to perform this action");
        }
    }
	public static void main(String[] args) {
		 try {
	          
	            checkAge(20);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
}




