package udemyexcercise;
import java.util.*;
public class sum_uoto_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thr n");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
}
	}
