package my_java_projects;

/*Write a java program to create an interface named Shape that contains two integers and an
empty method named printArea (). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes implements the class Shape. Each one of the classes
contains only the method printArea () that prints the area of the given shape*/

interface Shape
{
	 final int l= 10;
	 final int h=5;
	 void PrintArea();
}
class Rectangle implements Shape
{
	public void PrintArea() {
		System.out.println("Area of rectangle"+l*h);
	}
}
class Triangle implements Shape
{
	public void PrintArea() {
		double a=0.5*l*h;
		System.out.println("Area of Triangle"+a);
	}
}
class Circle implements Shape
{
	public void PrintArea()
	{
		double b=Math.PI*l*l;
		System.out.println("Area of Circle"+b);
	}
}
public class interface_area {

	public static void main(String[] args) 
	{
		Rectangle in=new Rectangle();
		in.PrintArea();
		Triangle ob=new Triangle();
		ob.PrintArea();
		Circle ci=new Circle();
		ci.PrintArea();
		
	}

}
