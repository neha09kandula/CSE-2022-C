package swathi;
interface Shape{
	int a;
	int b;
	void printArea();
}
class Rectangle implements Shape{
	 public void printArea() {
	 System.out.println("l*b");
}
}
class Triangle implements Shape{
	public void printArea() {
		System.out.println("1/2 *b*h");
	}
}
class Circle implements Shape{
	public void printArea() {
		System.out.println("3.14*r*r");
	}
}
public class Area {
	public static void main(String [] args) {
		Shape obj=new Rectangle();
		Shape obj1=new Triangle();
		Shape obj2=new Circle();
		obj1.printArea();
		obj.printArea();
		obj2.printArea();
		

}
}
