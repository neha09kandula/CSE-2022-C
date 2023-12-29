package cse225f1;
//import java.util.*;
//import java.lang;

public class exception_handling {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
		int [] number= {1,2,3,4,5};
		System.out.println(number[10]);
	}
	catch (Exception e)                        
	{
		System.out.println("this is wrong");
	}
	
	}

}
