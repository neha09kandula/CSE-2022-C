import java.util.*;
class factorial{
public static void main(String[] args)
{
int i=0,number,factorial=1;
Scanner input=new Scanner(System.in);
System.out.println("enter a number:");
number=input.nextInt();
for(i=1;i<number+1;i++)
{
factorial*=i;
}
System.out.println("factorial of the given number is:"+factorial);
input.close();
}
}