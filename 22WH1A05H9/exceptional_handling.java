package CSE22h9;

public class exceptional_handling {



	public static void main(String[] args) {
			int v1, v2;
			try {
			v1 = 0;
			v2 = 25 / v1;
			System.out.println(v2);
			System.out.println("Try Block");
			}
			catch (ArithmeticException e) {
			System.out.println(" Divide by Zero");
			}
			System.out.println("Arithmetic Exception");

	}

}
