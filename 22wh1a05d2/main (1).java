import java.util.Scanner;
class main{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number that want to divide:");
int num = input.nextInt();
if (num%5==0)
{
System.out.println(num+"is divvisible by 5");
}
else{
System.out.println(num+"is not divvisible by 5");
}
}
}
