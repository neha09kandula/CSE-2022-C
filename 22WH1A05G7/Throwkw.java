package cse225g7;

public class Throwkw {
	static void checkAge(int age) {
		if(age<18)
		{
			throw new ArithmeticException("age is not enough!!");
		}
		else
		{
			System.out.println("acess granted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);

	}

}
