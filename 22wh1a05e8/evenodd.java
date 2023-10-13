import java.util.*;
class main{
public static void main(String args[])
{
   Scanner input = new Scanner(System.in);
System.out.println("Enter the value:");
int num = input.nextInt();
if(num%2==0){
System.out.println("Number is Even");}
else{
System.out.println("Number is Odd");
}
input.close();
}
}