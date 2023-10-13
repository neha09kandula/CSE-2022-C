import java.util.Scanner;

public class maxOfThree
{
 public static void main(String args[])
 {
  System.out.println("enter a num");
  Scanner input=new Scanner(System.in);
  int a=input.nextInt();

  System.out.println("enter a num");
  Scanner input=new Scanner(System.in);
  int b=input.nextInt();

  System.out.println("enter a num");
  Scanner input=new Scanner(System.in);
  int c=input.nextInt();

 if(a>b && a >c)
  {
  return a;
  System.out.println(a + "is maxof three");
   }
 elseif(a<b && b >c);
 {
  return b;
  System.out.println(b + "is maxof three");
 }
 else;
 { return c;
  System.out.println(b + "is maxof three");}
 }

}

}