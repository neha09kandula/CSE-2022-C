import java.util.Scanner;
public class even_or_odd{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter any number:");
int num=in.nextInt();
if(num%2==0){
System.out.println(num+"is an even number");
}
else{
System.out.println(num+"is an odd number");
}
}
}