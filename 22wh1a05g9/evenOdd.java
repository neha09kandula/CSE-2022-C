import java.util.*;
class evenodd{
public static void main(String args[]){
System.out.println("enter a number");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
if (number % 2 == 0)
System.out.println("yes");
else
System.out.println("no");
input.close();
}
}
