import java.util.Scanner;
class evenodd
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("entre a number");
int num=input.nextInt();
if(num%2==0)
System.out.print("numbre is even");
else
System.out.print("number is odd");
input.close();
}
}

