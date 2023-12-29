package cse225g7;
import java.util.*;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in); 
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			int data=a/b;
			System.out.println(data);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
