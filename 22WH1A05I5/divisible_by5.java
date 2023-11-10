import java.util.Scanner;
public class divisible_by5{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter any number:");
int num=in.nextInt();
if(num%5==0){
System.out.println(num+" is divisible by 5");
}
else{
System.out.println(num+"is not divisible by 5");
}
}
}