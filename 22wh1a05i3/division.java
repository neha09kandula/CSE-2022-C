import java.util.Scanner;
class Main
{
static void division(int n)
{
if(n%5==0)
{
System.out.println("divisible by 5");
}
else
{
System.out.println("not divisible");
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





