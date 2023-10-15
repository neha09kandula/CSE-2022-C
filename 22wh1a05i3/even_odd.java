import java.util.Scanner;
class Main
{
static void division(int n)
{
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
public static void main(String[] args)
{
for(int i=0;i<2;i++)
{
System.out.println("enter a num");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
division(a);
}


}
}













