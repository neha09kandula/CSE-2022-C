package labprograms;
import java.util.*;
public class productdetails {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of products");
		int n=scan.nextInt();
		ArrayList<Integer> costList = new ArrayList<>();

		for(int i=1;i<=n;i++)
		{
			scan.nextLine();
			System.out.println("enter the product name");
			String s=scan.nextLine();
			System.out.println("enter the quantity");
			int q=scan.nextInt();
			System.out.println("enter the cost");
			int c=scan.nextInt();
			costList.add(c);
		}
		int maxCost = Collections.max(costList);
        System.out.println("Maximum cost value: " + maxCost);
	}
}
