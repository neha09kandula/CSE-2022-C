package CSE22h9;

public class finally_block {



	public static void main(String[] args) {
			try
			{
			int a = 125 / 5;
			System.out.println (a);
			}
			catch (NullPointerException e) {
			System.out.println ("Catch Block");
			}
			finally {
			System.out.println (" finally block executed");
			}

	}

}
