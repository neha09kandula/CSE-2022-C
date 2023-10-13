import java.util.Scanner;
class div{
	public static void main(String args[]){
	int x;
	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	x = sc.nextInt();
	if(x%5==0){
		System.out.println("True");
	}
	else{
		System.out.println("No Afsha..It is not divisible by 5");
	}
	sc.close();
}
}