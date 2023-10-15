public class Main//5.method
{
    public int  sum(int x,int y)
    {
        return x+y;
    }
    public float sum(float x,float y)
    {
        return x+y;
    }
    public int sum(int x,int y,int z)
    {
        return x+y+z;
    }
        
    
	public static void main(String[] args) {
	    Main a=new Main();
	    System.out.println(a.sum(10,6));
	    System.out.println(a.sum(10.4f,6.9f));
	    System.out.println(a.sum(10,6,3));
	    
		
	}
}