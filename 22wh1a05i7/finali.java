package javaprogram;

public class finali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(":: Try Block::");
			int data=155/5;
			System.out.println("Result:"+data);
		}
			catch(NullPointerException e)
			{
				System.out.println("::catch Block::");
			System.out.println(e);
		}
		finally
		{
			System.out.println("::Finally Block::");
			System.out.println("No Exception:: finally block executed");
			System.out.println("rest of the code....");
		}

	}
}


