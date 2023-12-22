package internal;
import java.util.*;
public class Area {
	public float carea(float r)
	{
		return  (float) (3.14*r*r);
		
	}
	public float rarea(float l,float w)
	{
		return l*w;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the raidus of the circle");
		float radius=input.nextFloat();
		System.out.println("Enter the length and width of the rectangle");
		float length = input.nextFloat();
		float width=input.nextFloat();
		Area obj = new Area();
		float r1 = obj.carea(radius);
		float r2= obj.rarea(length, width);
		System.out.println("The area of the circle is");
		System.out.println(r1);
		System.out.println("The area of the rectangle is");
		System.out.println(r2);
		input.close();
	}
}
