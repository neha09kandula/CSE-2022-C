package cse225g7;

public class excep {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		int val2;
		try {
			val2 = 25 / 0;
			System.out.println(val2);
		}
		catch (ArithmeticException e) {
			//handler for ArithmeticException
			System.out.println("ArithmeticException:: Divide by Zero!!");
		}
	}
	}
