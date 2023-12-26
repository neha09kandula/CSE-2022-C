/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class MyException
{
    public void num(int n)
    {
        try{
            if(n%2!=0)
            {
                throw new ArithmeticException("Exception");
            }
            else{
                System.out.println("even no exception");
            }
        }catch(ArithmeticException e){
            System.out.println("odd num so exception raised");
            
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		MyException m=new MyException();
		m.num(5);
	}
}
