package udemyexcercise;

public class timeconvertor {
	
	    public static int convertHoursToMinutes(int hours) {
	        // Your task: complete this method
	        int minutes;
	        if(hours>=0)
	        {
	        minutes=60*hours;
	        return minutes;
	        }
	        else{
	            return -1;
	        }
	    }
	    
	    public static int convertDaysToMinutes(int days) {
	        // Your task: complete this method
	        int minutes;
	        if(days>=0){
	        minutes=days*24*60;
	        return minutes;
	        }
	        else{
	            return -1;
	        }
	    }
	    public static void main(String[]args)
	    {
	    	System.out.println(convertHoursToMinutes(5));
	    	System.out.println(convertDaysToMinutes(5));
	    	
	    }
	    }
	

