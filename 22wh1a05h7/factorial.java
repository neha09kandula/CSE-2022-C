import java.util.*;
class factorial{
public static void main(String args[]){
int fact=0;
int i;
Scanner input=new Scanner(System.in);
System.out.println("Enter the value :");
int n=input.nextInt();
for (i=1;i<n+1;i++){
 fact= i * (i-1) ;
 
}
System.out.println("Factorial of given number is :" +fact);
input.close();
}
} 