import java.util.Scanner;
public class largest_of3{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter any number:");
int n1=in.nextInt();
int n2=in.nextInt();
int n3=in.nextInt();
if(n1>n2 && n1>n3){
System.out.println(n1+" is largest number");
}
else if(n2>n1 && n2>n3){
System.out.println(n2+" is largest number");
}
else{
System.out.println(n3+" is largest number");
}
}
}