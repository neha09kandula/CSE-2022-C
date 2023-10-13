import java.util.Scanner;
public class swap_without_thirdvariable{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter any number:");
int x=in.nextInt();
int y=in.nextInt();
System.out.println("numbers before swapping : "+x+" "+y);
x = x + y;   
y = x - y;   
x = x - y; 
System.out.println("numbers after swapping : "+x+" "+y);
}
}