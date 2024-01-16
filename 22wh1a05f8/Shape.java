package my_java_projects;

abstract class Shapes {
    int a;
    int b;
    abstract void Area(int a, int b);
}

class rec extends Shapes {
    void Area(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

class tri extends Shapes {
    void Area(int a, int b) {
        this.a = a;
        this.b = b;
        double c = 0.5 * (a * b);
        System.out.println("Area of Triangle: " + c);
    }
}

class cir extends Shapes{
	void Area(int a)
	{
		this.a=(int) (Math.PI*a*a);
		System.out.println("Area of Circle: "+a);
	}	
}

/*abstract class cir extends Shapes {
	void Area(int a) {
		// TODO Auto-generated method stub
		this.a=b;
		System.out.println("Area of circle"+ b);
	}
}*/

public class Shape {
    public static void main(String args[]) {
        rec ob = new rec();
        ob.Area(3, 5);

        tri o = new tri();
        o.Area(4, 9);

       cir ob1 = new cir();
        ob1.Area(6);
    }
}
