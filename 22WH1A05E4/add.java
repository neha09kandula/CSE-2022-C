class sum {
public int sum(int x,int y)
{
return(x+y);
}
public int sum (int x,int y,int z)
{
return(x+y+z);
}
public static void main(String args[])
{
sum s = new sum();
System.out.println(s.sum(10,30));
System.out.println(s.sum(40,30));
}
}