import java.util.*;
class swap{
public static void main(String[] args)
{
int a,b,temp;
Scanner input=new Scanner(System.in);
System.out.println("enter the values:");
a=input.nextInt();
b=input.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("The values of a and b are:"+a  +b);
input.close();
}
}