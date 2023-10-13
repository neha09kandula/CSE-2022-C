import java.util.*;
class main{
public static void main(String args[])
{
  Scanner input = new Scanner(System.in);
  System.out.println("enter the number");
  int num = input.nextInt();
if(num%2==0){
  System.out.println("number is even");
}
else{
System.out.println("number is odd");
  input.close();
}
}
}
