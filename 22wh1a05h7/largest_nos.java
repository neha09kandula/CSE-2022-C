import java.util.*;
class largest_number
{
	public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the three numbers");
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
if (a>b && a>c){
System.out.println("a is the largest number");
}
else if (b>a && b>c){
System.out.println(" b is the largest of three numbers");
}
else{
System.out.println(" c is the largest of three numbers");
}
input.close();
}
}