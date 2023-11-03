import java.util.Scanner;
public class greater{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=input.nextInt();
System.out.println("Enter the value of b: ");
int b=input.nextInt();
System.out.println("Enter the value of c: ");
int c=input.nextInt();
if (a>b&&a>c){
  System.out.println(a+ "is the greatest number");}
else if(b>c){
  System.out.println(b+ "is the greatest number");}
else
  System.out.println(c+ "is the greatest number");
}
}