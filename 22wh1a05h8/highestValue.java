
import java.util.Scanner;
public class highestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int Products = input.nextInt();
        input.nextLine(); 

        String productWithMaxValue = "";
        double maxProductValue = Double.MIN_VALUE;

        for (int i = 0; i < Products; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            
            System.out.print("Product name: ");
            String productName = input.nextLine();

            System.out.print("Enter quantity: ");
            int productQuantity = input.nextInt();

            System.out.print("Enter cost per unit: ");
            double costPerUnit = input.nextDouble();

            double totalCost = productQuantity * costPerUnit;

            System.out.println("Total cost for " + productName + ": " + totalCost);

            if (totalCost > maxProductValue) {
                maxProductValue = totalCost;
                productWithMaxValue = productName;
            }

            input.nextLine(); // Consume the newline character
        }

        System.out.println("\nProduct with the highest value:");
        System.out.println("Name: " + productWithMaxValue);
        System.out.println("Total Value: " + maxProductValue);

        input.close();
    }
}
