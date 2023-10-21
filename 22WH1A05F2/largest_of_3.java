import java.util.*;
public class largest_of_3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Enter the third number: ");
        int c = input.nextInt();
        if ((a>b)&&(a>c)){
            System.out.println(a+" is largest");
        }
        else if (b>c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}
