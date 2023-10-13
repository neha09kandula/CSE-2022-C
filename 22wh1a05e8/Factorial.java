import java.util.*;
class main{
public static void main(String args[])
{  
   int fact = 1;
   int i;
   Scanner input = new Scanner(System.in);
System.out.println("Enter the value to find Factorial:");
int num = input.nextInt();
for(i=num;i>0;i--){
fact=fact*i;
}
System.out.println("The Factorial of given number is:"+fact);
input.close();
}
}