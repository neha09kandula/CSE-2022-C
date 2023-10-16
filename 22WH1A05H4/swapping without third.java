import java.util.*;
class Swapwi {
public static void main(String args[])
{
Scanner input=new Scanner (System.in);
System.out.println("enter the number for n1 :");
int n1=input.nextInt();
System.out.println("enter the number for n2 :");
int n2=input.nextInt();
System.out.println("The values of A,B before swapping " + n1 + " " +n2);
{
n1=n1-n2;
n2=n1+n2;
n1=n2-n1;
System.out.println("The values of A,B after swapping " + n1 + " " +n2);
}

input.close();
}
}
