class finallyException {
	public static void main(String args[])
	{
		try {
			int divideByZero = 5/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticExpression => "+e.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}
	}
}
