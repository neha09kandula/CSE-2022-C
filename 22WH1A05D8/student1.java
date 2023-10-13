import java.util;
class student1{
public static void main(String args[])
{
  System.out.println("student details");
  scanner input = new scanner(System.in);
  System.out.println("enter your name:");
  String name= input.nextline();
  System.out.println("my name is:"+name);
  input.close();
}
}