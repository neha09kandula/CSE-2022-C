package labinternal1;
import java.util.*;
public class costly_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max_cost=0;
		int max_qnt=0;
		String name="";
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
			System.out.println("enter cost,quantity,name");
			
			int cost=sc.nextInt();
			int quantity=sc.nextInt();
			String nm=sc.nextLine();
			if(max_cost<cost) {
				max_cost=cost;
				max_qnt=quantity;
				name=nm;
			}
			n--;
		}
		System.out.println("max_cost:"+max_cost);
		System.out.println("qunty:"+max_qnt);
		System.out.println("name:"+name);

	}

}
