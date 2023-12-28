package priyanka5j0;
/*3. Define a class named Area which can be constructed by radius, length, and width.The Area
class have two methods : carea() to calculate area of circle and rarea() to calculate area of
rectangle
Sample Input & Output: Enter radius, length, and width - 4.5,12.2, 6.4
Area of circle with radius 4.50 is: 63.62
Area of rectangle with length 12.20 and width 6.40 is 78.08*/

import java.util.Scanner;

class Area{
	int width,length;
	float radius;
	public void carea(float radius) {
		this.radius=radius;
		System.out.printf("the area of circle with radius is %f is %f\n",radius,3.14*radius*radius);
	}
	public void rarea(int width,int length) {
		this.width=width;
		this.length=length;
		System.out.printf("the area of rectangle with sides %d and %d is : %d\n",width,length,width*length);
	}
}

public class simple2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float r=input.nextFloat();
		int w=input.nextInt();
		int l=input.nextInt();
		input.close();
		Area a=new Area();
		a.carea(r);
		a.rarea(w, l);



	}
}
