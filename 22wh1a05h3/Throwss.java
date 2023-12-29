package labprograms;
import java.util.*;
import java.io.IOException;
public class Throwss {

	
	
	    void myMethod(int num) throws IOException, ClassNotFoundException {
	        if (num == 1)
	            throw new IOException("IOException Occurred");
	        else
	            throw new ClassNotFoundException("ClassNotFoundException");
	    }
	}

	class throwskw {
	    public static void main(String args[]) throws IOException, ClassNotFoundException {
	        try {
	            Throwss obj = new Throwss();
	            obj.myMethod(1);
	        } catch (Exception ex) {
	            System.out.println(ex);
	        }
	    }
	}

	

	 
			

