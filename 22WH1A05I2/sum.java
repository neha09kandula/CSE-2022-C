public class sum
{
 public int sum(int x,int y)
 {
  return (x+y);
 }
 public int sum(int p, int q, int r)
 {
  return (p+q+r);
 }
 public double sum(double a,double b)
 {
  return (a+b);
 }
 
public static void main(String args[])
 {
  sum s=new sum();
  System.out.println(s.sum(10,20));

  sum p=new sum();
  System.out.println(p.sum(1,2,3));

  sum a=new sum();
  System.out.println(a.sum(1.20,2.30));


 }
}
