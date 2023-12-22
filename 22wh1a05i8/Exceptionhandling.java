package cse225i8;

public class Exceptionhandling {
	static void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException(" access denied");
			}
		else {
			System.out.println(" acess granted");
		}
	}

	public static void main(String args []) {
		int x,y;
		try {
			System.out.println("try block starts ");
			x=0;
			y=20/x;
			System.out.println("try blobk ends ");
			
		}
		catch(Exception e) {
			System.out.println("catch blobk starts ");
			System.out.println("Arthematic exception ");
		}
		System.out.println("out side try catch block ");
		checkage(15);
	}
	

}
