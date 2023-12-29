package gui;

public class exception_finally {
	public static void main(String[]args) {
	int num1;
	int num2;
	try {
		num1=5;
		num2=25/num1;
		System.out.println(num2);
	}
	catch(ArithmeticException e) {
		System.out.println("There is an error");
	}
	finally {
		System.out.println("this block executed");
	}
 System.out.println("rest of code!!!");
}
}