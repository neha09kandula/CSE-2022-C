package CSE22h9;

public class throw_exception {
		static void checkAge(int age) {
		if (age < 18) {
		throw new ArithmeticException(" You must be 18 years old.");
		}
		else {
		System.out.println(" You are allowed");
		}
		}
	

	public static void main(String[] args) {
		checkAge(15);

	}

}
