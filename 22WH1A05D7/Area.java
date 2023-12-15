package labinternal1;
import java.util.Scanner;
public class Area {
	public void carea(float r) {
		float circle = (float) (3.14 * r* r);
		System.out.println("Area of the circle with radius " + r + " is "+ circle);
	}
	public void rarea(float l, float b) {
		float rect = (float) ( l* b);
		System.out.println("Area of the rectangle with length" + l+" and width "+ b + " is "+ rect);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius, length and width");
		float r = sc.nextFloat();
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		Area a = new Area();
		a.carea(r);
		a.rarea(l, b);
		// TODO Auto-generated method stub

	}

}
