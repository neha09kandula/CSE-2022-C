import java.util.*;
class divisibleby5{
public static void main(String args[]){
System.out.println("enter a number");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
if (number % 5 == 0){
System.out.println("The number is divisible");
}
else
{
System.out.println("The number is not divisible");
}
input.close();
}
}
