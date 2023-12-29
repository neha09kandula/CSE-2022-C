package gui;

public class exception_throw {
	public static void checkAge(int age) {
		if(age<=20) {
			throw new ArithmeticException("not allowed");
		}
		else {
			System.out.println ("permission accepted");
		}
	}
	public static void main(String[]args)
	{
		checkAge(22);
	}

}
