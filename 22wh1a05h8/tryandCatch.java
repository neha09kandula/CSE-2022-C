package cse22523;

public class tryandcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		try {
			System.out.println("::Executing TRY BLOCK::");
			num = num/0;		
		}
		catch(Exception e) {
			System.out.println("::Found an exception::");
			System.out.println(e);
			System.out.println("-------------------------------------");
			System.out.println(":: Executing the rest of the code::");
		}
	}
}
