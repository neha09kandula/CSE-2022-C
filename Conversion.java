import java.util.Scanner;
public class Conversion{
public static void main(String[] args){
	int x;
	double y;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number");
	x=input.nextInt();
	y=(double) x;
	System.out.println(y);
}
}