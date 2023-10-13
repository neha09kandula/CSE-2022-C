import java.util.*;
class swapwothird{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the values:");
int a=input.nextInt();
int b=input.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("values of a and b after swapping:"+a +b);
}
}