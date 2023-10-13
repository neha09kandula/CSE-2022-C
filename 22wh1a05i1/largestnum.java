import java.util.*;
class largestnum 
{
public static void main(String[] args) 
{
Scanner reader = new Scanner(System.in);
System.out.print("Enter largest number");
System.out.print("Enter 1st ");
int num1 = reader.nextInt();
System.out.print("Enter 2nd");
int num2 = reader.nextInt();
System.out.print("Enter 3rd");
int num3 = reader.nextInt();
if(num1>num2 && num2>num3)
System.out.print("num1 is largest,num1");
else if(num1<num2 && num2>num3)
System.out.print("num2 is largest");
else
System.out.print("num3 is largest");

}
}