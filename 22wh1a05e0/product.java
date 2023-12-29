package Frame;
import java.util.Scanner;
public class product 
{

	     public static void main(String[] args) {
	         try (Scanner scanner = new Scanner(System.in)) {
				int n = scanner.nextInt();
				 String[] productName = new String[n];
				 int[] quantity = new int[n];
				 double[] cost = new double[n];
				 double[] value = new double[n];
				 double max = 0;
				 int index = 0;
				 for (int i = 0; i < n; i++) {
				     System.out.println("Enter product name, quantity, and cost of the product:");
				     productName[i] = scanner.next();
				     quantity[i] = scanner.nextInt();
				     cost[i] = scanner.nextDouble();
				     value[i] = quantity[i] * cost[i];
				     if (value[i] > max) {
				         max = value[i];
				         index = i;
				     }
				 }
				 System.out.println("The product with the highest value is " + productName[index] + " with a value of $" + String.format("%.2f", max));
			}
	     }
	 }

