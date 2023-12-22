package labinternalcseC;
public class oddCheck {
	private static void throwException(int a)
	{
		if(a%2!=0) {  
            throw new ArithmeticException("You entered am odd number.");    
        }  
        else {  
            System.out.println("No exceptions, number is even.");  
        }  			  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwException(5);
	}
}

