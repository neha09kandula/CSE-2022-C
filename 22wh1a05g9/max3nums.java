import java.util.*;
class maximum
{
public static void main(String args[])
{
System.out.println("Enter the first number");
Scanner input= new Scanner(System.in);
int a=input.nextInt();
System.out.println("Enter the second number");
int b=input.nextInt();
System.out.println("Enter the third number");
int c=input.nextInt();
if(a>b && a>c){
System.out.println("a is largest");
}
else if(b>c && b>a){
System.out.println("b is largest");
}
else{
System.out.println("c is largest");
}
}
}
