package Frame;

class throwex
{
  static void checkAge(int age)
    {
      if (age<18)
      {
          throw new ArithmeticException("Acess denied- You must be atleast 18 years old.");
      }
      else
      {
          System.out.println("Acess granted - You are old enough");
      }
    }
    public  static void main(String[] args)
    {
        checkAge(16);
    }
}