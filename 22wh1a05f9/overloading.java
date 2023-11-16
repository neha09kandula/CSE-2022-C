public class overloading
{
public int sum(int x,int y)
{
return (x+y);
}
public int sum(int x,int y ,int z)
{
return (x+y+z);
}
public static void main(String args[])
{
overloading s =new overloading();
overloading j =new overloading();
System.out.println(s.sum(1,1));
System.out.println(j.sum(1,1,1));
}
}