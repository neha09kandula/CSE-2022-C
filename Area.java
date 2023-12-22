package LabInternal;

public class Area {
	int rad, len, wid;
	
	void carea(int rad)
	{
		System.out.println("Area of circle is"+ 3.14*rad*rad);
	}
	void rarea(int len, int wid)
	{
		System.out.println("Area of rectangle:"+len*wid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area b= new Area();
		b.carea(4);
		b.rarea(3, 4);
	}
}
