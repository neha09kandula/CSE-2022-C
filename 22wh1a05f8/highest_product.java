package my_java_projects;

import java.util.Scanner;

public class highest_product {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] products = new String[n];
        int[] costs = new int[n];
        int[] quality=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the product name:");
            products[i] = sc.nextLine();
            
            System.out.println("Enter the quality:");
            quality[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the cost:");
            costs[i] = sc.nextInt();
            sc.nextLine(); 
        }
        int j=0;
        for (int i = 1; i < n; i++) {
            if (costs[i] > costs[j]) {
                j= i;
            }
        }

        System.out.println("Product with the highest cost:");
        System.out.println("Name: " + products[j]);
        System.out.println("Quality:"+quality[j]);
        System.out.println("Cost: " + costs[j]);
	}
}
