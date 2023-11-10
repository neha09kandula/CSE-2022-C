package udemyexcercise;

public class rightangledtriangle {
	    public static boolean isRightAngled(int side1, int side2, int side3) {
	        // write your code
	        if(side1>0 && side2>0 && side3>0 && (side1*side1)+(side2*side2)==(side3*side3) || (side2*side2)+(side3*side3)==(side1*side1) || (side3*side3)+(side1*side1)==(side2*side2))
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	           
	    }
	    public static void main(String[]args)
	    {
	    	System.out.println(isRightAngled(3,4,5));
	    }
	}
