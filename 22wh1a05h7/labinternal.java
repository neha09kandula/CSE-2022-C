package csec_labinternal1;
interface Shape
{
	int a=5;
	int b=2;
	abstract  void printArea();
}
class rectangle implements Shape
{
	public void printArea() {
		// TODO Auto-generated method stub
		int area=a*b;
		System.out.println("Area of rectangle is : "+area);
	}
	
}
class triangle implements Shape
{
	public void printArea()
	{
		int at=(int)(0.5*a*b);
		System.out.println("Area of triangle is : "+at);
	}
}
class circle implements Shape
{
	public void printArea()
	{
		float ac=(float) (3.14*a*a);
		System.out.println("Area of circle is : "+ac);
	}
}
public class labinternal {
	public static void main(String[] args)
	{
	rectangle o1=new rectangle();
	triangle o2=new triangle();
	circle o3=new circle();
	o1.printArea();
	o2.printArea();
	o3.printArea();
	}
}

