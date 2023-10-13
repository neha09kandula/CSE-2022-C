import java.util.Scanner;
class ooe {
public static void main(String args[])
{
	int n;
	Scanner number= new Scanner(System.in);
	System.out.println("enter a number!");
	n=number.nextInt();
	if (n %2 ==0){
		System.out.println("This number is even");
}
	else{
		System.out.println("This number is odd");
	} 
}
}