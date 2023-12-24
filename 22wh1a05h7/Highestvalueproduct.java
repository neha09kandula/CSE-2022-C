package programs;
import java.util.*;
public class Highestvalueproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner in = new Scanner(System.in);

		        System.out.print("Enter the number of products: ");
		        int numProducts = in.nextInt();
		        in.nextLine();
		        String maxProductName = "";
		        double maxProductValue = 0;
		        for (int i = 1; i <= numProducts; i++) {
		            System.out.println("\nEnter details for Product " + i + ":");
		            System.out.print("Product Name: ");
		            String productName = in.nextLine();

		            System.out.print("Quantity: ");
		            int quantity = in.nextInt();

		            System.out.print("Cost per unit: ");
		            double costPerUnit = in.nextDouble();

		            double productValue = quantity * costPerUnit;

		            if (productValue > maxProductValue) {
		                maxProductValue = productValue;
		                maxProductName = productName;
		            }
		            
		            in.nextLine(); 
		        }
		        in.close();
		        System.out.println("\nThe product with the highest value is: " + maxProductName);
		        System.out.println("Total value: " + maxProductValue);
	}

}
