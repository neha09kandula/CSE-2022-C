package udemyexcercise;
import java.util.*;
public class  is_prime {
	int count=0;
	int n;
	public boolean prime()
	{
	for(int i=2;i<=n;i++)
	{
		if(n%i==0) {
		count=count+1;
		}
	}
	if(count==1)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		is_prime obj =new is_prime();
		obj.n = n; // Initialize the 'n' variable in the object
		boolean Prime = obj.prime(); // Call the 'isPrime' method to check if it's prime

        if (Prime) {
            System.out.println("true"); // Print "true" if the number is prime
        } else {
            System.out.println("false"); // Print "false" if the number is not prime
        }
	}

}
