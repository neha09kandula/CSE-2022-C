package frames;

public class Finally {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Before Try block");	// TODO Auto-generated method stub
		     try
		     {
		    	 int c=25/5;
		    	 System.out.println("In try block");
		     }
		     catch(ArithmeticException e)
		     {
		    	 System.out.println("Exception ");
		     }
		     finally {
		    	 System.out.println("Finally Block always excecutes");  //whether exception is handled
		     }
		     System.out.println("Exception Hnadled");
	       
		}

	}
