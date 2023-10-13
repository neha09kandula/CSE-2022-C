import java.util.*;
class swap_using_variable{
public static void main(String args[])
{
int temp;
Scanner inp=new Scanner(System.in);
System.out.println("enter the values");
int a=inp.nextInt();
int b=inp.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("Values after swapping are  "   +a  +b);
inp.close();
}
}