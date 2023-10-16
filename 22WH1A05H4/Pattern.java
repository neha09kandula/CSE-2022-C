import java.util.*;
class Pattern {
public static void main(String args[])
{
int i=0;
Scanner input=new Scanner (System.in);
System.out.println("enter the number for rows :");
int num=input.nextInt();
for (i=0;i<num*2;i++)
{
System.out.println("@");
}

input.close();
}
}