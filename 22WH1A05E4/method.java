class methodOver
{
public int sum(int x)
{
return(x);
}
public int sum (int x,int y)
{
return(x+y);
}
public double sum (double x,double y)
{
return(x*y);
}
public static void main (String args[])
{
sum s = new sum();
System.out.println((2));
System.out.println(s.sum(10,20));
System.out.println(s.sum(6,20));
}
}
