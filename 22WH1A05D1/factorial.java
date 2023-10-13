import java.util.Scanner;
public class factorial{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter any number:");
int n1=in.nextInt();
int fact=1,i;
for(i=2;i<=n1;i++){
fact=fact*i;
}
System.out.println("factorial of "+n1+" is "+fact);
}
}