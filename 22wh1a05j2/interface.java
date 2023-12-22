package internal;
import java.io.*;

interface shape{
	int a=4;
	 int b=3;
	void printarea();
}
class rectangle implements shape{
	
	public void printarea() {
		
		System.out.println("area is:"+(2*a*b));
	}
	
}
class circle implements shape{

	public void printarea() {
		
		System.out.println("area is:"+(2*a*a));
	}
	
}
class triangle implements shape{

	public void printarea() {
		
		System.out.println("area is:"+(0.5*a*b));
	}
	
}

public class file_writing {

	public static void main(String[] args) {
	circle c=new circle();

	c.printarea();
	rectangle rec=new rectangle();
	
	rec.printarea();
	triangle t=new triangle();
	
	t .printarea();
	

	}

}
