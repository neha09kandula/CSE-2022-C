package cse225d3;
import java.util.Scanner;
public class Productdetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String productNameWithHighestValue = "";
        double highestValue = 0.0;

              System.out.print("Enter the number of products: ");
        int numOfProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        for (int i = 1; i <= numOfProducts; i++) {
            System.out.println("\nEnter details for Product " + i + ":");
           
            
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
           
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
           
            System.out.print("Enter cost of the product: ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left by nextDouble()

         
            double totalValue = quantity * cost;

            
            if (totalValue > highestValue) {
                highestValue = totalValue;
                productNameWithHighestValue = productName;
            }
        }

        
        System.out.println("\nThe product with the highest value is:");
        System.out.println("Product Name: " + productNameWithHighestValue);
        System.out.println("Total Value: $" + highestValue);

       
        scanner.close();
    }
}