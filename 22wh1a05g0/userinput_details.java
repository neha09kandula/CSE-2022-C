import java.util.Scanner;
class userinput{
	public static void main(String args[]){
	System.out.println("enter Ur name");
	Scanner sc= new Scanner(System.in);
	String Name= sc.nextLine();
	System.out.println("your name is "+ Name);
	System.out.println(" enter phone no.");
	String Phno = sc.nextLine();
	System.out.println("your phone num is "+ Phno);
	System.out.println("Age");
	int age = sc.nextInt();
	System.out.println("your age is "+ age);
	System.out.println(" enter rollno");
	float rollno= sc.nextFloat();
	System.out.println("your rollno is "+ rollno);
	System.out.println("enter your Gender");
	String gender= sc.next();
}
}