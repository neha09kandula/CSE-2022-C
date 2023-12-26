package cse_c;
import java.util.Scanner;
public class product {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of products: ");
	        int numProducts = scanner.nextInt();

	        String maxProductName = "";
	        int maxQuantity = 0;
	        
	        double maxCost = 0.0;

	        for (int i = 1; i <= numProducts; i++) {
	            System.out.println("\nEnter details for Product " + i + ":");
	            
	            System.out.print("Enter product name: ");
	            String productName = scanner.next();

	            System.out.print("Enter quantity: ");
	            int quantity = scanner.nextInt();

	            System.out.print("Enter cost of the product: ");
	            double cost = scanner.nextDouble();

	            double totalValue = quantity * cost;

	            System.out.println("Product Name: " + productName);
	            System.out.println("Quantity: " + quantity);
	            System.out.println("Cost: $" + cost);
	            System.out.println("Total Value: $" + totalValue);

	            if (totalValue > (maxQuantity * maxCost)) {
	                maxProductName = productName;
	                maxQuantity = quantity;
	                maxCost = cost;
	            }
	        }

	        System.out.println("\nProduct with the Highest Value:");
	        System.out.println("Product Name: " + maxProductName);
	        System.out.println("Quantity: " + maxQuantity);
	        System.out.println("Cost: $" + maxCost);
	        System.out.println("Total Value: $" + (maxQuantity * maxCost));

	        scanner.close();
	    }
	}
