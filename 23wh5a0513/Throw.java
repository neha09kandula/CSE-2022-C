package cse13;

public class Throw {
	static void checkage(int age) {
		if(age>18) {
			throw new ArithmeticException("valid voting");}
		
			else
			{
			System.out.println("not valid");	
			}
	}
 public static void main(String[] args)
 {
    checkage(15);
 }
	}

