package bvrith;
import java.util.Scanner;
interface Area{
       public void printArea();
}
public class Rectangleimplementsarea {
		public void printArea(){
	         Scanner sc = new Scanner(System.in);
	         System.out.println(" enter the length");
	         System.out.println(" enter the breadth");
	         int l=sc.nextInt();
	         int b=sc.nextInt();
	         int arearec=l*b;
	     System.out.println(" area of rectangle:"+arearec);
	    System.out.println(" ");
	     }
}
class Triangle implements Area{
	  public void printArea(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the length");
	  
	        System.out.println("enter the breadth");
	         int l=sc.nextInt();
	         int b=sc.nextInt();
	        double areatri= 0.5*l*b;
	        System.out.println(" area of triangle:"+areatri);
	        
	    }
	}
class Main{
    public static void main(String args[]){
        Triangle obj=new Triangle();
        obj.printArea();
        Triangle t =new Triangle();
        t.printArea();
    }
}  
      
	
	



