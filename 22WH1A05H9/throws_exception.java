package CSE22h9;
import java.io.IOException;

class throwss {
	void myMethod(int num)throws IOException,
	ClassNotFoundException{
	if(num==1)
	throw new IOException("IOException Occurred");
	else
	throw new
	ClassNotFoundException("ClassNotFoundException");
	}
	}
	public class throws_exception{

	public static void main(String[] args) {
		try{
			throwss obj=new throwss();
			obj.myMethod(1);
			}catch(Exception ex){
			System.out.println(ex);

	}

}
	}
