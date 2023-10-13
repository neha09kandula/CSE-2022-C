import java.util.*;
class pattern
{
public static void main(String[] args)
{
int i=0,j=0,k=0;
Scanner input=new Scanner(System.in);
System.out.println("enter your number");
int rows=input.nextInt();
for(i=1;i<rows;i++)
{
for(j=1;j<=rows-1;j++){
System.out.println("");
}
for(k=1;k<=2*i-1;k++){
System.out.println("*");
}
System.out.println("");
}
input.close();
}
}

