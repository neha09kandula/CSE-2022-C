import java.util.Scanner;
class area
{
    double r;
    double l;
    double w;
    area()
    {
      this.r=r;
      this.l=l;
      this.w=w;
    }
    public void
    carea(double r)
    {
        System.out.println(3.14*r*r);
    }
    public double rarea(double l,double w)
    {
        return l*w;
    }
}
class HelloWorld{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("entre radius");
       double r =sc.nextDouble();
       System.out.println("entre length");
       double l=sc.nextDouble();
        System.out.println("entre width");
        double w=sc.nextDouble();
        area a=new area();
        a.carea(r);
        System.out.println(a.rarea(l,w));
        
    

    }
}