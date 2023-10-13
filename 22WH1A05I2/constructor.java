public class constructor
{
 int x;
 int y;
 public constructor(int y)
 {
  x=7;
  y=x;
 }
 public static void main(String args[])
 {
  constructor obj=new constructor();
  System.out.println(obj.y);
 }
}