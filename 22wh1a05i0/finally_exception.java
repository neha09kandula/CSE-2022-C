package cse225i0;

public class finally_exception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try block

		try
		{
		System.out.println ("::Try Block::");
		int data = 125 / 5;
		System.out.println ("Result:" + data);
		}
		//catch block
		catch (NullPointerException e) {
		System.out.println ("::Catch Block::");
		System.out.println (e);
		}
		//finally block
		finally {
		System.out.println (":: Finally Block::");
		System.out.println ("No Exception::finally block executed");
		}
		System.out.println ("rest of the code...");
		}
}
