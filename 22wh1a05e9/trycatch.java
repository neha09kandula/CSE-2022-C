package labinternal;

public class trycatch {

	public static void main(String[] args) {
	 System.out.println("Before Try block");	// TODO Auto-generated method stub
     try
     {
    	 int c=25/0;
    	 System.out.println("In try block");
     }
     catch(ArithmeticException e)
     {
    	 System.out.println("Exception ");
     }
     System.out.println("Exception Hnadled");
	}

}
