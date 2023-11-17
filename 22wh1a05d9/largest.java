import java.util.*;
class largest{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the values:");
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
if (a>b && a>c)
{
System.out.println("a is the largest");
}
else if (b>c && b>a)
{
System.out.println("b is the largest");
}
else{
System.out.println("c is the largest"); 
}
input.close();
}
}