import java.util.Scanner;
public class Isdiv
{

public static void main(String[] args)
{
int n;
Scanner input=new Scanner(System.in);
System.out.println("number");
n=input.nextInt();
if(n % 5==0){
System.out.println("divisible");
}
else{
System.out.println("not divisible");
}
}
}