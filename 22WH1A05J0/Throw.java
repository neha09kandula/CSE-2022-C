package priyanka5j0;

public class Throw {
	
	static void  VoteRight(int age)
	{   try
	  {
		if(age<18)
		{
			throw new ArithmeticException("you have NO right to vote");
		}
		System.out.println("you have right to vote");
	  }  
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
  public static void main(String args[])
  {
	 VoteRight(15);
	 VoteRight(25);
	 
  }
}
