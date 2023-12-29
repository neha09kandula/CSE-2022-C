package cse225e8;
import java.util.*;
import java.lang.*; 

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] roll = {33,36,39};
			System.out.println(roll[2]);
		}
		catch(Exception e)
		{
			System.out.println("Index out of Range");
		}
		finally
		{
			System.out.println("Code is completed Succesfully");
		}

	}

}
