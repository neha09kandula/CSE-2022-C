public class sum
{
public int sum(intx,inty)
{
  return(x+y);
}
public int sum(intx,inty,intz)
{
  return(x+y+z);
}
public static void main(String args[])
{
  sum s=new sum();
  System.out.println(s.sum(10,20));
  System.out.println(s.sum(10,20,30));
}
}