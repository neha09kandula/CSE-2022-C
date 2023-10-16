import java.util.*;
class division {
public static void main(String args[])
{
Scanner input=new Scanner (System.in);
System.out.println("enter the number :");
int num=input.nextInt();
if(num%5==0) {
System.out.println(num+  "is divisible by 5");
 }
else {
 System.out.println(num+ "is not divisible by 5");
}
input.close();
}
}
