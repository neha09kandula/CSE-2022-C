package lab_questions;

import java.util.Scanner;

public class OddNumberExceptionExample
{
    // Method that throws an exception if the number is odd
    public static void checkIfEven(int number) throws OddNumberException
    {
        if (number % 2 != 0)
        {
            throw new OddNumberException("Number is odd. Exception thrown.");
        }
        else
        {
            System.out.println("Number is even.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNumber = sc.nextInt();

        try
        {
            checkIfEven(userNumber);
        }
        catch (OddNumberException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class OddNumberException extends Exception
{
    public OddNumberException(String message)
    {
        super(message);
    }
}