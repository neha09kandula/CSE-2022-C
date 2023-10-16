package javapractice;
import java.util.*;

public class assign1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=input.nextInt();
		switch(number%2) {
		case 0:
			System.out.println("the given number is even");
			break;
		case 1:
			System.out.println("the given number is odd");
			break;
		default:
			System.out.println("invalid output");
			
		}
		

	}

}
