package Frame;
import java.util.*;
public class Area {
	void  carea (float r,float pi){
	System.out.println("The area of the circle is:" +(pi*r*r));
	}
    void rarea(float l,float b) {
    System.out.println("The area of the rectangle is :" +(l*b));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   System.out.println("Enter the radius:");
   float r=input.nextFloat();
   System.out.println("Enter the lenght:");
   float l=input.nextFloat();
   System.out.println("Enter the width:");
   float b=input.nextFloat();
   System.out.println("Enter the pi value:");
   float pi=input.nextFloat();
   Area c=new Area();
      c.carea(r, pi);
   Area t=new Area();
      t.rarea(l, b);
	}

}

