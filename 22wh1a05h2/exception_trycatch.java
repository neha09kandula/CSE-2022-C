package gui;

public class exception_trycatch {
	

	public static void main(String[] args) {
		int num1;
		int num2;
		
		try{

			 num1 =  0;
			 num2 = 25/num1;
			System.out.println(num2);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception: divided by zero");
		}
		System.out.println("rest of code");

	}

}
