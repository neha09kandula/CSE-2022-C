package swathi;
import java.util.*;
public class Customer {
	
	
public static void main(String [] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the product name:");
	String P1=input.nextLine();
	System.out.println("Enter the quantity");
	int Q1=input.nextInt();
	System.out.println("Enter the price");
	int price1=input.nextInt();
	input.nextLine();
	System.out.println("Enter the next customer details:");
	System.out.println("Enter the product name:");
	String P2=input.nextLine();
	System.out.println("Enter the quantity:");
	int Q2=input.nextInt();
	System.out.println("Enter the price for second");
	int price2=input.nextInt();
	input.close();
	if(price1>price2) {
		System.out.println("The highest price is "+P1);
		
	}
	else {
		System.out.println("The highest price is"+P2);
	}
}
}