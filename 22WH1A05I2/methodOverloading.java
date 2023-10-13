class methodOverloading
{
 private static void display(int a)
 {
  System.out.println("Arg" + a);
 }
 private static void display(int a, int b)
 {

  System.out.println("Arg" + a + "and" + b);
 }

 public static void main(String args[])
 {
  display(1);
  display(1,6);
  }
}
