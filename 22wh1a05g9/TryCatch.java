package LabInternal;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int num1=25;
			int num2=0;
			int result=num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception: Cannot divide by zero");
			
		}
		// TODO Auto-generated method stub

	}

}
