package csec;
import java.io.IOException;
class throwss {
  void mYMethod(int num)throws IOException,
  ClassNotFoundException{
	  if(num==1)
		  throw new IOException("Exception occurred");
  else
	  throw new ClassNotFoundException("ClassNotFoundException");
  }
}
public class  Exceptionthrows{
	public static void main(String[]args)
	{ try {
		throwss obj=new throwss();
		obj.mYMethod(1);
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
