package swathi;
public class Java1 {
  public static void check_odd(int n) 
  {


			 if((n%2)!=0)
			 {
				 throw new RuntimeException("number is odd");
			 }
			 else
			 {
		            System.out.println("The number is even.");

		     }

	 }

public static void main(String[] args) {
    try 
    {

        check_odd(10);
        check_odd(15);
    } 
    catch (RuntimeException e) 
    {
        System.out.println(e);
    }
}
}
