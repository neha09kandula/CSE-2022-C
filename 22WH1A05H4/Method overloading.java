 class sum {
public int sum(int x,int y)
{ 
return(x+y);
}
public int sum(int x,int y,int z)
{
return(x+y+z);
}
public float sum(float x, float y)
{
return(x+y);
}
public static void main(String args[])
{
sum s= new sum();
System.out.println(s.sum(10,20));
System.out.println(s.sum(10,20,5));
System.out.println(s.sum(1,2));
}
}