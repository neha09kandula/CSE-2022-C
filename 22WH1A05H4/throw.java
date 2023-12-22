package Frame;

public class Vennela {
	
	void throwkw(int age) {
		if(age<18)
		{
			System.out.println("You are not eligible for vote");
		}
		else
		{
			throw new ArithmeticException("You are eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vennela obj=new Vennela();
       obj.throwkw(21);
	}

}
