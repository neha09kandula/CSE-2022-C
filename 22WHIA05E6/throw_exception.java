package java_internal_questions;


import java.util.Scanner;
public class throw_exception{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        try {
            if (num % 2 != 0) {
                throw new Exception("Entered number is odd!");
            }
            System.out.println(num + " is even.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } 
    }
}