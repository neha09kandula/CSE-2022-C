public class callmethod
{
public int callmethod(int x,int y)
{
return(x+y);
}
public int callmethod(int x, int y,int z)
{
return(x+y+z);
}
public static void main(String args[])
{
	callmethod obj1 = new callmethod();
	System.out.println(obj1.callmethod(10,20));
	System.out.println(obj1.callmethod(10,20,10));
}
}