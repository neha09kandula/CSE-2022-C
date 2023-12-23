import java.util.Scanner;
class Weekdays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        
         if(n==1) 
         {
             System.out.println(" monday");
         }
        else if(n==2)
        {
        System.out.println("tuesday");
        }
        else if(n==3)
        {
        System.out.println("wednesday");
        }
        else if(n==4)
        {
        System.out.println("thursday");
        } 
        else if(n==5)
        {
        System.out.println("friday");
        }
        else if(n==6)
        {
        System.out.println("saturday");
        }
        else if(n==7)
        {
            System.out.println("sunday");
        }
        else
        {
            System.out.println(" invalid  day");
        }
}
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}

