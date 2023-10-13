import java.util.*;
class even_odd
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int number = input.nextInt();
if (number%2== 0){
System.out.println("The number is Even");
}
else
{
System.out.println("The number is odd");
}
input.close();
}
}