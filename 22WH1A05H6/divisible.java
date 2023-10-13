import java.util.*;
class divisible
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number:");
int number=input.nextInt();
if (number%5==0){
System.out.println("number is divisible by 5"+number);
}
else{
System.out.println("number is not divisible by 5"+number);
}
System.out.println(number);
input.close();}
}
