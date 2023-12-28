import java.util.Scanner;

	public class LabInternalq1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of products:");
	        int numProducts = scanner.nextInt();

	        String productName;
	        int quantity;
	        double cost;
	        double maxValue = 0;
	        String maxProductName = "";

	        for (int i = 1; i <= numProducts; i++) {
	            System.out.println("Enter details for product " + i + ":");
	            System.out.print("Product name: ");
	            scanner.nextLine(); 
	            productName = scanner.nextLine();
	            System.out.print("Quantity: ");
	            quantity = scanner.nextInt();
	            System.out.print("Cost per unit: ");
	            cost = scanner.nextDouble();

	            double totalValue = quantity * cost;
	            System.out.println("Total value for " + productName + ": " + totalValue);

	      
	            if (totalValue > maxValue) {
	                maxValue = totalValue;
	                maxProductName = productName;
	            }
	        }

	        
	        System.out.println("\nProduct with the highest value:");
	        System.out.println("Name: " + maxProductName);
	        System.out.println("Total Value: " + maxValue);

	        scanner.close();
	    }
	}

