package java_programs;
import java.util.*;
public class product_details {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int numProducts = scanner.nextInt();

		        String maxProductName = "";
		        int maxProductQuality = 0;
		        double maxProductCost = 0.0;

		        for (int i = 1; i <= numProducts; i++) {
		            System.out.println("\nEnter details for product " + i + ":");
		            
		            System.out.print("Product Name: ");
		            String productName = scanner.next();

		            System.out.print("Product Quality: ");
		            int productQuality = scanner.nextInt();

		            System.out.print("Product Cost: ");
		            double productCost = scanner.nextDouble();

		            // Calculate total cost for the product
		            double totalCost = productQuality * productCost;

		            System.out.println("Total Cost for " + productName + ": " + totalCost);

		            // Check if the current product has a higher value than the current maximum
		            if (totalCost > maxProductCost) {
		                maxProductName = productName;
		                maxProductQuality = productQuality;
		                maxProductCost = totalCost;
		            }
		        }

		        System.out.println("\nProduct with the highest value:");
		        System.out.println("Product Name: " + maxProductName);
		        System.out.println("Product Quality: " + maxProductQuality);
		        System.out.println("Product Cost: " + maxProductCost);

		        scanner.close();
		    }


	}
