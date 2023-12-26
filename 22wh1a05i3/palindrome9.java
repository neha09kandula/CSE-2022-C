/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class check
{
    public void num(int num)
    {
        int temp=num;
        int r;
        int rev=0;
        while(temp!=0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
            
            
            
        }
        if(rev==num)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("notpalindrome");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    check c=new check();
	    c.num(1221);
	}
}
