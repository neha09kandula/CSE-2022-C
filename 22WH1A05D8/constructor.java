public class constructor
{
   public constructor(int y)
   {
     int x=5;
     y=x;
   }
   public static void main(String args[])
  {
    constructor obj1=new constructor();
    System.out.println(obj1.y);
  }
}