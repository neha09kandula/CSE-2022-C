/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class check
{
    public void num(int num)
    {
        int mul=1;
        int sum=0;
        int temp=num;
        int r;
        int rev=0;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r;
            mul=mul*r;
            
            temp=temp/10;
            
            
            
        }
        if(sum==mul)
        {
            System.out.println("spynumber");
        }
        else{
            System.out.println("notspynumber");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    check c=new check();
	    c.num(1124);
	}
}
