package labinternal;

public class Throw {
   void validate(int age)
   {
	   if(age<18)
	   {
		   throw new ArithmeticException("Not Valid");
	   }
	   else
	   {
		   System.out.println("You are Eligible");
	   }
	   
   }
   
   
   public static void main(String args[])
   {
	   Throw n = new Throw();
	   n.validate(15);
   }
}
