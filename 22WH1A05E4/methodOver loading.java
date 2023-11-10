class methodOver loading 
{
public int sum(int x)
{
return(x);
}
public int sum (int x,int y)
{
return(x+y);
}
public static void main (string args[])
{
sum s = new sum();
System.out.print(s.sum(2));
System.out.print(s.sum(10,20));
}
}
