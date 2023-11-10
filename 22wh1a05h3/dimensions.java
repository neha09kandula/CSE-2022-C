package udemyexcercise;

public class dimensions {
	
	    private int feet;
	    private int inches;
	    
	    public dimensions(int inches) {
	        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
	        // Store the feet and inches in their respective instance variables.
	        if(inches<0)
	        {
	        this.feet=-1;
	        this.inches=-1;
	        }
	        else{
	           this.feet= inches/12;
	           this.inches=inches%12;
	        }
	    }
	    
	    public int getFeet() {
	        // TODO: Return the value of feet.
	        return feet;
	    }
	    
	    public int getInches() {
	        // TODO: Return the value of inches.
	        return inches;
	    }    
	
	public static void main(String[]args)
	{
		dimensions dimension = new dimensions(25); // Example usage with 24 inches
        System.out.println("Feet: " + dimension.getFeet());
        System.out.println("Inches: " + dimension.getInches());
	}
	}

