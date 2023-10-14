class methodol
{
int x;
int y;
public int sum(int x)
{
y = 6;
return (x+y);
}
public int sum(int x, int y)
{

return (x+y);
}
public int sum(int x, int y, int z)
{
return (x+y+z);
}
public static void main(String args[])
{
methodol ob = new methodol();
System.out.println(ob.sum(5));
System.out.println(ob.sum(5,6));
System.out.print(ob.sum(5,4,6));
}
}