import java.util.Scanner;
class even_odd{
	public static void main(String args[]){
		int x;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x % 2 == 0){
			System.out.println("Afsha, it is even..");
		}
		else{
			System.out.println("Afsha, it is odd..");
		}
	}
}

