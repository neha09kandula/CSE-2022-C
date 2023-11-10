package udemyexcercise;

public class perfectnumber {
	    public static boolean isPerfectNumber(int number) {
	        int sum=0;
	        int i;
	        if(number<=0)
	        {
	        return false;
	        }
	        else{
	            for(i=1;i<number;i++)
	            {
	                if(number%i==0)
	                {
	                    sum=sum+i;
	                }
	            }
	            if(sum==number)
	            {
	                return true;
	            }
	            else{
	                return false;
	            }
	        }
	    }
	    public static void main(String[]args)
	    {
	    	System.out.println(isPerfectNumber(5));
	    }
	}
