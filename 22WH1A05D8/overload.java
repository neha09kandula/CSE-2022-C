class overloading{
private static void display(int a)
{
  system.out.println("arguments"+a);
}
private static void display(int a,int b)
{
  system.out.println("arguments:"+a+"and"+b);
}
public static void main(string args[])
{
 display(1);
 display(2);
}