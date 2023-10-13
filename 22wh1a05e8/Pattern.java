import java.util.*;
class main{
public static void main(String args[])
{
   int i;
   Scanner input = new Scanner(System.in);
System.out.println("Enter the value:");
int num = input.nextInt();
while(num!=0){
for(i=0;i<num;i++){
System.out.print("*");}
System.out.print("\n");
num=num-1;
}
input.close();
}
}
