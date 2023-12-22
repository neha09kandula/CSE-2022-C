package cse22523;

public class tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		try {
			System.out.println("::Executing try block ::");
			num = num/1;
			System.out.println("::No exceptions::");
		}
		catch(Exception e) {
			System.out.println(":: Exception caught ::");
			System.out.println(e);
		}
		finally {
			System.out.println("::Entered Finally block::");
			System.out.println("This block is always executed.");
		}
		System.out.println("-------------------------------------");
		System.out.println("Rest of the code gets executed");

	}

}
