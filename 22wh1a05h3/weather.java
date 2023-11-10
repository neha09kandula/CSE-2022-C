package udemyexcercise;

public class weather {
	    public static String provideWeatherAdvisory(int temperature) {
	        if (temperature < 0) {
	            return "It's freezing! Wear a heavy coat.";
	        } else if (temperature >= 0 && temperature <= 10) {
	            return "It's cold! Bundle up.";
	        } else if (temperature >= 11 && temperature <= 20) {
	            return "It's cool! A light jacket will do.";
	        } else if (temperature > 20) {
	            return "It's warm! Enjoy the day.";
	        } else {
	            return "Temperature input is invalid.";
	        }
	    } // Missing '}' for the method

	    // The class closing brace is also missing here
	    public static void main(String[]args)
	    {
	    	System.out.println(provideWeatherAdvisory(26));
	    }
	}
