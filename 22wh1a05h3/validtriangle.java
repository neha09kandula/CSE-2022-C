package udemyexcercise;

public class validtriangle {

	    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
	        // write your code here
	        if(angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1+angle2+angle3==180)
	        {
	            return true;
	        }
	        else{
	            return false;
	        }
	        
	    }
	    public static void main(String[]args)
	    {
	    System.out.println(isValidTriangle(60,30,90));	
	    }
	}


