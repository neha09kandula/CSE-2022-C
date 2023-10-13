import java.util.Scanner;
class evenorodd{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int num = input.nextInt();
if (num%2==0)
{
System.out.println(num+"the given number is even");
}
else{
System.out.println(num+"the given number is odd");
}
}
}
