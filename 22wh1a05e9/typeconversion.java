import java.util.*;

class main{
public static void main(String args[])
{ 
  int x=5;
  double a=200000.06;
System.out.println("Data type of x before typeconversion is:"+((Object)x).getClass().getSimpleName());
System.out.println("Data type of a before typeconversion is:"+((Object)a).getClass().getSimpleName());
byte y=(byte)x;
int b = (int)a;
System.out.println("Data type of x after typeconversion is:"+((Object)y).getClass().getSimpleName());
System.out.println("value of x after typeconversion is:"+y);
System.out.println("Data type of a after typeconversion is:"+((Object)b).getClass().getSimpleName());
System.out.println("value of a after typeconversion is:"+b);
}
}