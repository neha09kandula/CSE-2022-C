package javaprograms;
import java.util.*;
public class Area {
	void  carea (float r,float pi){
	System.out.println("The area of circle is:" +(pi*r*r));
	}
    void rarea(float l,float b) {
    System.out.println("The area of rectangle is :" +(l*b));
    }

	public static void main(String[] args) {
		
         Scanner input=new Scanner(System.in);
         System.out.println("Enter radius:");
         float r=input.nextFloat();
         System.out.println("Enter lenght:");
         float l=input.nextFloat();
         System.out.println("Enter width:");
         float b=input.nextFloat();
         System.out.println("Enter pi value:");
         float pi=input.nextFloat();
         Area y=new Area();
         y.yarea(l, b);
         Area x=new Area();
         x.rarea(r, pi);
	}

}
