import java.util.*;
class pattern
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("enter the number of rows");
int num =input.nextInt();
input.close();
while(num!=0)
{
for(int i=0;i<=num;i++)
{
System.out.print("*");
}
System.out.print("\n");
num=num-1;
}
}
}