import java.util.*;
public class even_or_odd{
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2==0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}

