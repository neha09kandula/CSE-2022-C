package lab_questions;

import java.util.*;

public class ProductDetails {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of products:");
		int numberOfProducts = sc.nextInt();
        String[] productNames = new String[numberOfProducts];
        int[] quantities = new int[numberOfProducts];
        double[] costs = new double[numberOfProducts];
        
        for (int i = 0; i < numberOfProducts; i++)
        {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product Name: ");
            productNames[i] = sc.next();

            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();

            System.out.print("Cost per unit: ");
            costs[i] = sc.nextDouble();
        }

        double[] totalValues = new double[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++)
        {
            totalValues[i] = quantities[i] * costs[i];
        }

        int maxIndex = 0;
        for (int i = 1; i < numberOfProducts; i++)
        {
            if (totalValues[i] > totalValues[maxIndex])
            {
                maxIndex = i;
            }
        }

        System.out.println("Product with the highest value:");
        System.out.println("Product Name: " + productNames[maxIndex]);
        System.out.println("Quantity: " + quantities[maxIndex]);
        System.out.println("Cost per unit: " + costs[maxIndex]);
        System.out.println("Total Value: " + totalValues[maxIndex]);
    }
}