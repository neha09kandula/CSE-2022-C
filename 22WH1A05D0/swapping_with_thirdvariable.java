import java.util.Scanner;
public class swapping_with_thirdvariable{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter any number:");
int n1=in.nextInt();
int n2=in.nextInt();
System.out.println("numbers before swapping :"+n1+" "+n2);
int temp;
temp=n1;
n1=n2;
n2=temp;
System.out.println("numbers afterswapping : "+n1+" "+n2);
}
}
