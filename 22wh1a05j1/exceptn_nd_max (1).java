package labinternal1;
import java.util.*;
class odd{
	public void exce(int num)throws OddNumberException {
		
			if(num%2!=0) {
				throw new OddNumberException("Odd number detected: " + num);
			}
		
			 else {
		            System.out.println(num + " is an even number.");
		        }
		
	}
}

public class exceptn_nd_max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number from 1 to 7");
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		odd o=new odd();
		try {
            
            o.exce(5);
        } catch (OddNumberException e) {
          
            System.out.println("Caught exception: " + e.getMessage());
        }

		
		switch(n) {
		case 1:
            System.out.println("Sunday");
            break;
        case 2:
        	 System.out.println("Monday");
        	 break;
        case 3:
        	 System.out.println("Tuesday");
        	 break;
        case 4:
        	 System.out.println( "Wednesday");
        	 break;
        case 5:
        	 System.out.println("Thursday");
        	 break;
        case 6:
        	 System.out.println("Friday");
        	 break;
        case 7:
        	 System.out.println( "Saturday");
        	 break;
       
		}
		
	}
}


class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
