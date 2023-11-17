package javapractice;
import java.util.*;


public class evenorodd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=input.nextInt();
		if (number%2==0)
		{
			System.out.println("given number even"); 
		}
		else
		{
			System.out.println(" given number is odd");
		}
		
		input.close();
	}
}