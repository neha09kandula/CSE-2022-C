package java_5e3;
import java.util.*;

public class basic_scanner {

	public static void main(String[] args) {
		System.out.println("Student details");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name: ");
	    String name=input.nextLine();
		System.out.println("My name is: "+name);
		input.close();
		

	}

}
