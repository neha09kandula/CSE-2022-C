package Javaprograming;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("Studen details");
		Scanner input= new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=input.nextLine();
		System.out.println("My name is:"+name);
		input.close();
	}

}
