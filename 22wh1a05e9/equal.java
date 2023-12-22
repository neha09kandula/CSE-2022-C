package labinternal;
import java.util.Scanner;

public class equal {
     public void num(int a,int b,int c,int d)
     {
    	 if(a==b && b==c && c==d)
    	 {
    		 System.out.println("Equal");
    	 }
    	 else
    	 {System.out.println("Not Equal");
    	 
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner read = new Scanner(System.in);
  int a = read.nextInt();
  int b = read.nextInt();
  int c = read.nextInt();
  int d = read.nextInt();
  equal obj = new equal();
  obj.num(a, b, c, d);
  
  
  
	}

}
