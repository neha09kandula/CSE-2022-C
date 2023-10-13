class sum{
public int sum(int x,int y)
{
	return (x+y);
}
public int sum(int a, int b, int c)
{
	return (a+b+c);
}
public double sum(double d, double e)
{
	return d+e;
}
public static void main(String args[])
{
	sum s = new sum();
System.out.println(s.sum(10,20));
System.out.println(s.sum(11,22,44));
System.out.println(s.sum(2,4));
}
}