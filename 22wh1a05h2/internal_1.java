package javaprograms;
import java.util.*;
public class Product {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);

		        System.out.print("Enter number of products: ");
		        int num = in.nextInt();
		        in.nextLine();
		        String maxProductName = "";
		        double maxProductValue = 0;
		        for (int i = 1; i <= num; i++) {
		            System.out.println("Enter details for Product " + i );
		            System.out.print("Product Name: ");
		            String productName = in.nextLine();

		            System.out.print("Quantity is: ");
		            int quantity = in.nextInt();

		            System.out.print("Cost per unit: ");
		            double cost= in.nextDouble();

		            double productValue = quantity * cost;

		            if (productValue > maxProductValue) {
		                maxProductValue = productValue;
		                maxProductName = productName;
		            }
		            
		            in.nextLine(); 
		        }
		        in.close();
		        System.out.println("\nThe product with  highest value is: " + maxProductName);
		        System.out.println("Total value is: " + maxProductValue);
	}

}
