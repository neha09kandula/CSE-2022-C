import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
int temp;
System.out.println("enter a ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter b");
Scanner r=new Scanner(System.in);
int b=r.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("val of a after swap");
System.out.println(a);
System.out.println("val of b after swap");
System.out.println(b);

}
}
















