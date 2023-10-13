import java.util.*;
class student{
public static void main(String args[]){
	System.out.println("details");
	Scanner input = new Scanner(System.in);
	System.out.println("enter name");
	String name = input.nextLine();
	System.out.println("my name is "+name);
	input.close();
}
}