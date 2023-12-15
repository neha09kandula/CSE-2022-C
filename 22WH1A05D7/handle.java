package labinternal1;

import java.util.Scanner;

public class handle {
	public void check( int i) {
		if( i % 2 != 0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println("integer is valid(even)");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int i = sc.nextInt();
			handle c = new handle();
			c.check(i);
		    } 
		catch (IllegalArgumentException e) {
		      System.out.println("Exception :the number is odd");
		    }
		
	}

}
