//implement scanner class
import java.util.Scanner;
public class scannerclass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter your first number: ");
        a = sc.nextInt();
        System.out.println("Enter your second number: ");
        b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println("The sum of two numbers is:" + (a+b));
        sc.close();
    }
}
