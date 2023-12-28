package programs;
import java.util.*;
interface Shape
{
	abstract void printArea(int a,int b);	
}
class rectangle implements Shape
{
	public void printArea(int a,int b) {
		// TODO Auto-generated method stub
		int area=a*b;
		System.out.println("Area of rectangle is : "+area);
	}
	
}
class triangle implements Shape
{
	public void printArea(int a,int b)
	{
		int at=(int)(0.5*a*b);
		System.out.println("Area of triangle is : "+at);
	}
}
class circle implements Shape
{
	public void printArea(int a,int b)
	{
		float ac=(float) (3.14*a*a);
		System.out.println("Area of circle is : "+ac);
	}
}
public class Shapearea_using_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of one side :");
		a=input.nextInt();
		System.out.println("Enter the value of another side :");
		b=input.nextInt();
		rectangle o1=new rectangle();
		triangle o2=new triangle();
		circle o3=new circle();
		o1.printArea(a,b);
		o2.printArea(a,b);
		o3.printArea(a,b);
		input.close();
	}

}
