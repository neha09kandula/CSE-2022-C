package Frame;
import java.io.*;
import java.util.Scanner;
public class internal{
	public static void main(String[]Args){
		try{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the X value:");
			int x=input.nextInt();
			System.out.println("Enter the Y value:");
			int y=input.nextInt();
			int c=x/y;
			System.out.println("The value of c is:" +c);
			
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			
		}
		
	}
}

