package csec_labinternal1;

import java.util.Scanner;

public class eh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number into array");
		try
		{
			a[5]=in.nextInt();
			System.out.println("The number is inserted into array" );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Something went wrong");
			System.out.println("Array size is exceeded");
		}
		finally
		{
			System.out.println("Finally block ");
		}
		in.close();
	}

}
