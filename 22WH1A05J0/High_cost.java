package priyanka5j0;

/*1. Write a java program to read product details from customer like (product name, quantity,
and cost of the product), now display the product which is having highest value.*/
import java.util.*;
public class High_cost {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max_cost=0;
		int max_qt=0;
		String name="";
		Scanner input=new Scanner(System.in);
		System.out.println("enter how many customer details were present");
		int n=input.nextInt();
		while(n>0) {
			System.out.println("enter cost,quantity,name");

			int cost=input.nextInt();
			int quantity=input.nextInt();
			String nm=input.next();
			if(max_cost<cost) {
				max_cost=cost;
				max_qt=quantity;
				name=nm;
			}
			n--;
		}
		System.out.println("max_cost:"+max_cost);
		System.out.println("qunty:"+max_qt);
		System.out.println("name:"+name);

	}
}
