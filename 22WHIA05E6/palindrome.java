package java_internal_questions;

import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner n = new Scanner(System.in);
       int num = n.nextInt();
       int temp = num;
       int rev =0,r=0;
       while(num!=0)
       {
    	   r = num%10;
    	   rev = rev*10+r;
    	   num=num/10;
       }
       if(rev == temp)
       {
    	   System.out.println("Palindrome");
       }
       else
       {
    	   System.out.println("Not Palindrome");
       }
	}

}