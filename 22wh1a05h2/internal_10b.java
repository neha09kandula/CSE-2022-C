package javaprograms;
import java.util.Scanner;

class palindrome 
{  
   public static void main(String args[])  
   {  
      String s, rev = "";   
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter string:");  
      s = in.nextLine();   
      int length = s.length();   
      for (int i = length - 1; i >= 0; i--)  
         rev = rev + s.charAt(i);  
      if (s.equals(rev)) { 
         System.out.println("It is palindrome");  
      }
      else { 
         System.out.println("It is not palindrome");  
      }
   }  
}
