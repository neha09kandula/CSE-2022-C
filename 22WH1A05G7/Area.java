package programs;
import java.util.*;

public class Area {

	public void carea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle with radius "+r+" is :"+area);
	}
	public void rarea(double l,double w)
	{
		double area=l*w;
		System.out.println("Area of rectangle with length "+l+" and width "+w+" is :"+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double r,l,w;
			Scanner in=new Scanner(System.in);
			System.out.print("Enter radius,length and width: ");
			r=in.nextDouble();
			l=in.nextDouble();
			w=in.nextDouble();
			Area a=new Area();
			a.carea(r);
			a.rarea(l, w);
			in.close();
	}

}
