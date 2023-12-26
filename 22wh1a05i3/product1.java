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
	    System.out.println("entre numbers");
	    int n=sc.nextInt();
	    int maxnum=Integer.MIN_VALUE;
	    for(int i=0;i<=n;i++)
	    {
	        System.out.println("product name");
	        String p1=sc.next();
	        System.out.println("quanty");
	        int q1=sc.nextInt();
	        System.out.println("cost price");
	        int c1=sc.nextInt();
	        if(c1>maxnum)
	        maxnum=c1;
	        System.out.println(p1);
	        System.out.println(maxnum);
	       
	        
	    }
	  
	    
	}
	}
