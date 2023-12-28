package cse13;
import java.util.Scanner;

public class ProductDetails {
	 public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter the number of products: ");
	    int numProducts = scanner.nextInt();
	     String productNameWithHighValue = "";
	      int quantityWithHighValue = 0;
	      double costWithHighValue = 0;
	      double highValue = 0;
	          for (int i = 0; i < numProducts; i++) {
	          System.out.println("\nEnter details for Product " + (i + 1) + ":");
	            
	            
	  System.out.print("Enter product name: ");
	  String productName = scanner.next();
	      System.out.print("Enter quantity: ");
	       int quantity = scanner.nextInt();
	        System.out.print("Enter cost per unit: ");
	        double cost = scanner.nextDouble();
	        double productValue = quantity * cost;
	        if (productValue > highValue) 
	        {
	            productNameWithHighValue = productName;
	            quantityWithHighValue = quantity;
	            costWithHighValue = cost;
	             highValue = productValue;
	            }
	          }
	        System.out.println("\nProduct with the highest value:");
	        System.out.println("Product Name: " + productNameWithHighValue);
	        System.out.println("Quantity: " + quantityWithHighValue);
	        System.out.println("Cost per unit: " + costWithHighValue);
	        System.out.println("Total Value: " + highValue);

	        scanner.close();
	 }
}
	

	
