package udemyexcercise;
import java.util.*;
public class squares_upto_limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		while(i<n)
		{
			System.out.println(i*i);
			i++;
		}
	}

}
