package framework;
import java.util.Scanner;
public class Internal1 {

				  public static void main(String[] args) {
				        Scanner scanner = new Scanner(System.in);

				        System.out.println("Enter the number of products: ");
				        int numProducts = scanner.nextInt();

				        String productName = "";
				        int quantity = 0;
				        double cost = 0;
				        double maxValue = 0;
				        String maxProduct = "";

				        for (int i = 0; i < numProducts; i++) {
				            System.out.println("\nEnter details for product " + (i + 1) + ":");
				            scanner.nextLine();
				            System.out.print("Enter product name: ");
				            productName = scanner.nextLine();

				            System.out.print("Enter quantity: ");
				            quantity = scanner.nextInt();

				            System.out.print("Enter cost of the product: ");
				            cost = scanner.nextDouble();

				            double value = quantity * cost;

				            if (value > maxValue) {
			                maxValue = value;
				                maxProduct = productName;
				            }
				        }

				        if (!maxProduct.isEmpty()) {
				            System.out.println("\nThe product with the highest value is: " + maxProduct);
				            System.out.println("Value: " + maxValue);
				        } else {
				            System.out.println("\nNo products entered.");
				        }

				        scanner.close();
				    }
	

		

	

	}


