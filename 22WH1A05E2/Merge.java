package lab_questions;
import java.util.*;

public class Merge
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter string 1:");
    	String s1=sc.nextLine();
    	System.out.println("Enter string 2:");
        String s2=sc.nextLine();
        System.out.println("The strings merged is:");
        String mergedString1 = s1 +s2 ;
        System.out.println(mergedString1);
    }
}