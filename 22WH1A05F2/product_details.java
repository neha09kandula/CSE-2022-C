import java.util.*;
public class product_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of products: ");
        int products = sc.nextInt();
        String highestProduct = "";
        int highestValue = Integer.MIN_VALUE;
        for (int i = 1; i <= products; i++) {
            System.out.println("Name of the product: ");
            String name = sc.next();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Cost of the product: ");
            int cost = sc.nextInt();
            int productValue = quantity * cost;
            if (productValue > highestValue) {
                highestValue = productValue;
                highestProduct = name;
            }
        }
        System.out.println("Product with the highest value is: " + highestProduct + " and it's total is: " + highestValue);
    }
}