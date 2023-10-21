import java.util.*;
public class swap_without_third_variable{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("before swapping a is: "+a+" and b is: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a is: "+a+" and b is: "+b);
    }
}