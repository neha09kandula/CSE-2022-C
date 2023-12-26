interface shape
{
    int a=4;
    int b=8;
    public void area();
}
class rectangle implements shape
{
	public void area()
	{
		System.out.println(a*b);
	}
}
class triangle implements shape
{
	public void area()
	{
	System.out.println((0.5)*a*b);
}
}
class circle implements shape
{
	public void area()
	{
		System.out.println(3.14*a*a);
	}
}
	
class HelloWorld{
    public static void main(String[] args) {
       rectangle r1=new rectangle();
		triangle t1=new triangle();
		circle c1=new circle();
		r1.area();
		t1.area();
		c1.area();

    }
}