package lab_questions;

import java.util.Scanner;

public class CompareInteger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = sc.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = sc.nextInt();

        System.out.println("Enter the fourth integer:");
        int num4 = sc.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}