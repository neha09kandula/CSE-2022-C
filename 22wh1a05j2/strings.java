package labinternal1;
import java.util.*;
public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1+s2;
		System.out.println("merge string is:"+s3);
		System.out.println("enter a string to check palindrome");
		String s=sc.nextLine();
		
        int right = s.length() - 1;
        String re="";

        for(int i=right;i>=0;i--) {
        	re+=s.charAt(i);
        }
           
        if (s.equals(re)) {
            	
            
               System.out.println("given string is a palindrome");
           
            }
            else {
            	System.out.println("given string is a not-palindrome");
            }
	}

}
