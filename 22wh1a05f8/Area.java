package my_java_projects;

/*Define a class named Area which can be constructed by radius, length, and width.The Area
class have two methods : carea() to calculate area of circle and rarea() to calculate area of
rectangle
Sample Input & Output: Enter radius, length, and width - 4.5,12.2, 6.4
Area of circle with radius 4.50 is: 63.62
Area of rectangle with length 12.20 and width 6.40 is 78.08*/

public class Area {
	int r=5;
	int l=20;
	int width=17;
	public void carea()
	{
		System.out.println("Area of circle"+Math.PI*r*r);
	}
	public void rarea()
	{
		System.out.println("Area of rectangle"+l*width);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area in=new Area();
		in.carea();
		in.rarea();
	}

}
