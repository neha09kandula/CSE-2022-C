import java.util.Scanner;
class largestnumber{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter any numbers:");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();
if (num1>num2 && num1>num3){
System.out.println(num1+"this is the largest number");}
else if (num2>num1 && num2>num3){
System.out.println(num2+"this is the largest number");}
else{
System.out.println(num3+"this is the largest number");
}
}
}


