public class overloading{
	public int overloading(int x, int y)
{
	return x+y;
}
	public int overloading(int x, int y, int z)
{
	return x+y+z;
}
	public double overloading(double x, double y)
{
	return x+y;
}
public static void main(String args[]){
	overloading obj = new overloading();
	System.out.println(obj.overloading(12,8));
	System.out.println(obj.overloading(12,8,5));
	System.out.println(obj.overloading(11.5,7.5));
}
}