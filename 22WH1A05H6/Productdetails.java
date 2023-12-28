package csec;
import java.util.Scanner;
public class Productdetails {

	public static void main(String[] args) {

		      Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the number of products:");
		        int numProducts = scanner.nextInt();
		        String highestValueProductName = "";
		        int highestValueQuantity = 0;
		        double highestValueCost = 0;
		        double highestValue = 0;
		        for (int i = 1; i <= numProducts; i++) {
		            System.out.println("\nEnter details for product " + i + ":");
		            System.out.print("Product Name: ");
		            String productName = scanner.next();
		            System.out.print("Quantity: ");
		            int quantity = scanner.nextInt();
		            System.out.print("Cost per unit: ");
		            double costPerUnit = scanner.nextDouble();
		            double totalCost = quantity * costPerUnit;
		            if (totalCost > highestValue) {
		                highestValue = totalCost;
		                highestValueProductName = productName;
		                highestValueQuantity = quantity;
		                highestValueCost = costPerUnit;
		            }
		        }
		        System.out.println("\nProduct with the highest value:");
		        System.out.println("Product Name: " + highestValueProductName);
		        System.out.println("Quantity: " + highestValueQuantity);
		        System.out.println("Cost per unit: " + highestValueCost);
		        System.out.println("Total value: " + highestValue);

		        scanner.close();
		    }


	}


