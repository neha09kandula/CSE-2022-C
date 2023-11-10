import java.util.*;
class specificpattern{
public static void main(String args[]){
int i,j;
System.out.println("enter a number");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
for(i=0;i<=number;i++)
{
System.out.println(" ");
for(j=0;j<i;j++)
{
System.out.print(" * ");
}
}
input.close();
}
}
