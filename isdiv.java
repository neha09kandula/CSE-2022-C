import java.util.*;
class isdiv{
int x;
public String div(int x){
if(x%5==0){
return("True");}
else{
return("False");}
}
public static void main(String args[]){
System.out.println("ENTER A NUMBER YOU WANT TO CHECK: ");
Scanner input=new Scanner(System.in);
int num = input.nextInt();
isdiv a = new isdiv();
System.out.println(a.div(num));
input.close();
}
}