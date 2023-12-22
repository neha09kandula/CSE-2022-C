package internal;

public class area
{
	
interface shape
{
	int a=5;
	int b=10;
}
public void printArea() {
	

class rectangle implements shape
{
	int areaOfRectangle=a*b;
}
class triangle implements shape
{
	int areaOfTriangle=a*b;
}
class circle implements shape
{
	int areaOfCircle=a*b;
}
}
public static void main(String args[])
{
	area obj=new area();
	System.out.println(obj.areaOfRectangle(5,10));
	System.out.println(obj.areaOfTriangle(5,10));
	System.out.println(obj.areaOfCircle(5));
}
private char[] areaOfCircle(int i) {
	// TODO Auto-generated method stub
	return null;
}
private char[] areaOfTriangle(int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
private char[] areaOfRectangle(int i, int j) {
	// TODO Auto-generated method stub
	return null;
}

}