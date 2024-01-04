package java_internal_questions;
import java.util.Scanner;
public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of products:");
		 int n = scan.nextInt();
		 String maxProduct = "";
	        int maxQuantity = 0;
	        int maxCost = 0;

	
		 for(int i=0;i<n;i++) {
		System.out.println("enter the details for product:"+(i+1));
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the product name:");
		 String productname = scanner.nextLine();
		 System.out.println("Enter Quantity:");
		 int quantity = scanner.nextInt();
		 System.out.println("Enter the cost:");
		 int cost = scanner.nextInt();
		 int totalValue = quantity * cost;
         if (totalValue > (maxQuantity * maxCost)) {
             maxProduct = productname;
             maxQuantity = quantity;
             maxCost = cost;
		 }
		}
		 System.out.println("Product with the highest value:");
	        System.out.println("Name: " + maxProduct);
	        System.out.println("Quantity: " + maxQuantity);
	        System.out.println("Cost per unit: $" + maxCost);
	        System.out.println("Total Value: $" + (maxQuantity * maxCost));
	        scan.close();

}
	
}