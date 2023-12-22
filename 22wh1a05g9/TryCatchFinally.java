package LabInternal;

public class TryCatchFinally{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			int num1=25;
			int num2=0;
			int result=num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception: Cannot divide by zero");
		}
		finally {
			System.out.println("Finally block Executed");
		}
	}
}
