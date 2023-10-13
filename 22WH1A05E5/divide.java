import java.util.Scanner;
public class divide {
public static void main(String args[])
{
	int n;
	Scanner number= new Scanner(System.in);
	System.out.println("enter a number!");
	n=number.nextInt();
	if (n %5 ==0){
		System.out.println("This number is divisible by 5!");
}
	else{
		System.out.println("This number is not divisible by 5!");
	} 
}
}