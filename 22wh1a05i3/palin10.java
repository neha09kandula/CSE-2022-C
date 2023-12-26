/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	System.out.println("entre string");
	    String name=sc.next();
	   // 	System.out.println(name);
	    char [] ch=name.toCharArray();
	    String rev="";
	    for(int i=name.length()-1;i>=0;i--)
	    {
	        rev=rev+ch[i];
	    }
	   // 	System.out.println(rev);
	    if(name.equals(rev))
	    {
	        	System.out.println("palindrome");
	    }
	    else{
	        	System.out.println("notpalindrome");
	    }
	}
}

