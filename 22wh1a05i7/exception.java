package Javaprogram;
import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		try
		{
			if(a%2==0)
				System.out.println("even");
		}
		catch(ArithmeticException e)
		{
			System.out.println("error occured");
		}
		

	}

}
