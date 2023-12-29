package labprograms;

import java.util.*;
public class Finall {

	

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        try {          
	            System.out.println("::Try Block::");     
	            int data = 125 / 5;       
	            System.out.println("Result:" + data);    
	        } catch (NullPointerException e) {  // Changed the exception type to ArithmeticException
	            System.out.println("::Catch Block::");  
	            System.out.println(e);     
	        } finally {    
	            System.out.println(":: Finally Block::");     
	            System.out.println("No Exception::finally block executed");     
	        }       
	        System.out.println("rest of the code..."); 
	    }
	}


